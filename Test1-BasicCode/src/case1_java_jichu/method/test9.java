package case1_java_jichu.method;

import java.util.Scanner;

/*
需求：在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
```
 */
public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        method(a,b,c);
    }

    public static void method(int a,int b,int c){
        int max = 0;
        int min = 0;
        if (a > b && a > c){
            max = a;
        }else if (b > a && b > c){
            max = b;
        }else{
            max = c;
        }

        if (a < b && a < c){
            min = a;
        }else if (b < a && b < c){
            min = b;
        }else {
            min = c;
        }
        int mid = a + b + c - max - min;
        System.out.println("从大到小依次的顺序为：" + max +" "+ mid +" "+ min);
    }
}
