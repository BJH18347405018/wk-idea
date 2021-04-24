package case1_java_jichu.jinZhi;
/*
需求：已知来个整数变量a = 10;b = 20;使用程序实现这俩个变量的数据交换
    最终输出a = 20;b = 10;
    不允许使用第三方变量
 */

public class test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
}