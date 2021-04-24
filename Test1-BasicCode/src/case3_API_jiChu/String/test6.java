package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：键盘录入一个字符串，使用程序实现在控制台遍历改字符串
 */
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个人字符串：");
        String str = sc.nextLine();
        for (int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
