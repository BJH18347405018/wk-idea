package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：以字符串的形式从键盘录入学生信息，例如：“张三，23”从该字符串中切割出有效数据
        封装为Student学生对象
 */
public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String stuInfo = sc.nextLine();

        String[] sArr = stuInfo.split(",");

        Student2 stu = new Student2(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"...."+stu.getAge());
    }
}
