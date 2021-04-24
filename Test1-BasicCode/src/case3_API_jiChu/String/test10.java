package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：键盘录入一个字符，如果字符串中包含（TMD），则使用***替换
 */
public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        String c = str.replace("TMD","***");
        System.out.println(c);

    }
}
