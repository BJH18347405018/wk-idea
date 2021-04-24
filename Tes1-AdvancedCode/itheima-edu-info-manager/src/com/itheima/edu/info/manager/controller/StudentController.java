package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public void start() {
        //开启学生管理系统，并展示学生管理系统菜单
        studentLoor :
        while (true){
            System.out.println("----------欢迎来到<学生>管理系统----------");
            System.out.println("请输入您的选择：1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updataStudent();
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break studentLoor;
                default:
                    System.out.println("您的输入有误，请输入正确的选项");
            }
        }

}

    public void updataStudent() {
        String updataId = inputStudentId();
        Student newStu = inputStudentInfo(updataId);

        studentService.updataStudent(updataId,newStu);
        System.out.println("修改学生成功");
    }

    public void deleteStudentById() {
        String delId = inputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功");
    }

    public void findAllStudent() {
        Student[] stus = studentService.findAllStudent();
        if (stus == null){
            System.out.println("经查询，没有信息");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null){
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }
        }
    }


    public void addStudent() {
        String id;
        while (true){
            System.out.println("请输入学生学号：");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("您输入的学号已经存在，请重新输入：");
            }else {
                break;
            }
        }

        Student stu = inputStudentInfo(id);

        boolean result = studentService.addStudent(stu);

        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //获取id
    public String inputStudentId(){
        String id;
        while (true){
            System.out.println("请输入你要删除的学号：");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists){
                System.out.println("您输入的学号不存在，请核对后重新输入：");
            }else {
                break;
            }
        }
        return id;
    }

    //键盘录入学生信息
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
