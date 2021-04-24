package case4_jiHeJiChu.ArrayList;

import case4_jiHeJiChu.domain.Student;

import java.util.ArrayList;

/*
集合元素筛选
需求：定义一个方法，方法接收一个集合对象（泛型为Student），方法内部将年龄低于18的学生对象找出并存入新集合对象，方法返回新集合
 */
public class Test5ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        Student stu1 = new Student("张三",10);
        Student stu2 = new Student("李四",10);
        Student stu3 = new Student("王五",20);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        ArrayList<Student> newList = getList(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
    public static ArrayList<Student> getList(ArrayList<Student> list){
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age < 18){
                newList.add(stu);
            }
        }
        return newList;
    }
}
