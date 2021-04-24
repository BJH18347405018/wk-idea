package case4_jiHeJiChu.ArrayList;

import case4_jiHeJiChu.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/*
存储学生对象并遍历
需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        学生的姓名和年龄来自于键盘录入
 */
public class Test3ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName()+"..."+temp.getAge());
        }
    }

    private static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();

        Student stu = new Student(name,age);

        return stu;
    }
}
