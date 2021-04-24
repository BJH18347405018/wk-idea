package case3_API_jiChu.String;

import java.util.Scanner;

public class test7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
