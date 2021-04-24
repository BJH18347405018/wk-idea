package case4_jiHeJiChu.mStudentManger;

import case4_jiHeJiChu.domain.mStudent;

import java.util.ArrayList;
import java.util.Scanner;

import static case4_jiHeJiChu.mStudentManger.TestmStudent.*;

public class tStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mStudent> list = new ArrayList<mStudent>();
        while (true){
            System.out.println("-----欢迎来到学生管理哦系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");

            int choice = sc.nextInt();

            lo:switch (choice){
                case 1:
                    //System.out.println("添加学生");
                    addStudent(list);
                    break;
                case 2:
                    //System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case 3:
                    //System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case 4:
                    //System.out.println("查看学生");
                    queryStudent(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入：");
                    break;
            }
        }
    }
    //添加学生
    public static void addStudent(ArrayList<mStudent> list){
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("请输入学生的学号：");
            sid = sc.next();

            int index = getIndex(list,sid);
            if (index == -1){
                break;
            }
        }

        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日：");
        String birthday = sc.next();
        mStudent stu = new mStudent(sid,name,age,birthday);
        list.add(stu);
        System.out.println("添加学生成功！");
    }
    //查看学生
    public static void queryStudent(ArrayList<mStudent> list){
        if (list.size() == 0){
            System.out.println("无信息，请添加后重新查询");
            return;
        }
        System.out.println("学号"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"生日");
        for (int i = 0; i < list.size(); i++) {
            mStudent stu = list.get(i);
            System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
        }
    }
    public static int getIndex(ArrayList<mStudent> list,String sid){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            mStudent stu = list.get(i);
            String id = stu.getSid();

            if (id.equals(sid)){
                index = i;
            }
        }
        return index;
    }
    //删除学生
    public static void deleteStudent(ArrayList<mStudent> list){
        System.out.println("请输入要删除学生的学号：");
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        int index = getIndex(list,deleteSid);
        if (index == -1){
            System.out.println("学号不存在，请从新输入：");
        }else {
            list.remove(index);
            System.out.println("学生删除成功");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<mStudent> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String updateStudent = sc.next();
        int index = getIndex(list,updateStudent);
        if (index == -1){
            System.out.println("学号不存在，请重新输入：");
        }else {
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = sc.next();

            mStudent stu = new mStudent(updateStudent,name,age,birthday);
            list.set(index,stu);
            System.out.println("学生信息修改成功");
        }
    }
}
