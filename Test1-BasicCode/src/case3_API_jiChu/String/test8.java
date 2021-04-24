package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：键盘录入一个字符串，统计该字符串中的大小写字母字符和数字字符出现的次数（不考虑其他字符）
 */
public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z'){
                count1++;
            }else if (c >= 'a' && c <= 'z'){
                count2++;
            }else if (c >= '0' && c <= '9'){
                count3++;
            }
        }
        System.out.println("大写字母字符的个数为："+count1);
        System.out.println("小写字母字符的个数为："+count2);
        System.out.println("数字字符的个数为："+count3);
    }
}
