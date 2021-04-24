package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherConeroller {
    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);
    public void start() {
        teacherLoop :
        while (true){
            System.out.println("----------欢迎来到<laos>管理系统----------");
            System.out.println("请输入您的选择：1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    //System.out.println("修改老师");
                    updataTeacher();
                    break;
                case "4":
                    //System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统，再见！");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误，请输入正确的选项");
            }
        }

    }

    public void updataTeacher() {
        String id = inputTeacherId();
        Teacher newTeacher = inputTeacherInfo(id);

        teacherService.updataTeacher(id,newTeacher);
        System.out.println("修改成功");

        System.out.println();
    }


    public void deleteTeacherById() {
        String id = inputTeacherId();
        teacherService.deleteTeacherById(id);
        System.out.println("删除成功");
    }

    public void findAllTeacher() {
        Teacher[] teachers = teacherService.findAllTeacher();
        if (teachers == null){
            System.out.println("查无信息，请添加后重试。");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if (t != null){
                System.out.println(t.getId()+"\t"+t.getName()+"\t"+t.getAge()+"\t\t"+t.getBirthday());
            }
        }
    }

    public void addTeacher() {
        String id;
        while (true){
            System.out.println("请输入你要添加老师的id");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (exists){
                System.out.println("您输入的id已存在，请重新输入：");
            }else {
                break;
            }
        }

        Teacher t = inputTeacherInfo(id);
        boolean result = teacherService.addTeacher(t);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public String inputTeacherId(){
        String id;
        while (true) {
            System.out.println("请输入你要获取的id：");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入：");
            } else {
                break;
            }
        }
        return id;
    }

    public Teacher inputTeacherInfo(String id){
        System.out.println("请输入你要添加的老师姓名");
        String name = sc.next();
        System.out.println("请输入你要添加老师的年龄");
        String age = sc.next();
        System.out.println("请输入你要添加老师的生日");
        String birthday = sc.next();

        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        t.setBirthday(birthday);

        return t;
    }
}
