package case3_API_jiChu.String;

import java.util.Scanner;

/*
需求：已知用户名和密码，请用程序实现模拟用户登陆。总共给三次机会，登陆子厚给出相应的提示。
 */
public class test5 {
    public static void main(String[] args) {
        String username = "admin";
        String passward = "123456";

        Scanner sc = new Scanner(System.in);


        for (int i = 1;i <= 3;i++){
            System.out.println("请输入用户名：");
            String str1 = sc.nextLine();

            System.out.println("请输入密码：");
            String str2 = sc.nextLine();
            if (username.equals(str1) && passward.equals(str2)){
                System.out.println("登陆成功！");
                break;
            }else {
                System.out.println("用户名或密码错误，登陆失败！"+"请从新输入："+"您还有"+(3-i)+"次机会");
                if (i == 3){
                    System.out.println("您的次数已达到今日上线，请明日再来！");
                }
            }

        }

    }
}
