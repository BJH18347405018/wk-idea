package case4_jiHeJiChu.ArrayList;

import case4_jiHeJiChu.domain.Student;

import java.util.ArrayList;

/*
存储学生对象并遍历
需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class Test2ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName()+"...."+temp.getAge());
        }
    }
}
