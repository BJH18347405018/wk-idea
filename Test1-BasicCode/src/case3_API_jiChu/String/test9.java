package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：以字符串的形式从键盘接收一个手机号，将中间四位手机号码屏蔽
    最终效果为：156****1234
 */
public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个电话号码：");
        String str = sc.nextLine();

        String s1 = str.substring(0,3);
        String s2 = str.substring(7);

        System.out.println(s1+"****"+s2);
    }
}
