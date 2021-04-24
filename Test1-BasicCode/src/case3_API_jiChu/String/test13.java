package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
 */
public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        str = str.toUpperCase();

        int count1 = 0;
        int count2 = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char cc = chars[i];
            if (cc >= 'A' && cc <= 'Z'){
                count1++;
            }else if (cc >= '0' && cc <= '9'){
                count2++;
            }
        }
        System.out.println("英文字母有"+count1+"个");
        System.out.println("数字有"+count2+"个");
    }
}
