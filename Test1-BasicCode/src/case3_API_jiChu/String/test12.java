package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串。
 */
public class test12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        for (int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            System.out.println(c);
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
