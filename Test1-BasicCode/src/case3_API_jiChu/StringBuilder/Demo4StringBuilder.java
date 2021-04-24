package case3_API_jiChu.StringBuilder;

import java.util.Scanner;

/*
需求：键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并控制台打印是不是
        对称字符串：123321，11
        非对称字符串，123123
 */
public class Demo4StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverseStr = sb.toString();
        if (str.equals(reverseStr)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("非对称字符串");
        }
    }
}
