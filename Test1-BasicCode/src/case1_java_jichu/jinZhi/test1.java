package case1_java_jichu.jinZhi;
/*
需求：已知来个整数变量a = 10;b = 20;使用程序实现这俩个变量的数据交换
        最终输出a = 20;b = 10;
 */
public class test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
