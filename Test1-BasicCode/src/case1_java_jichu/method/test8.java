package case1_java_jichu.method;
/*
需求：定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
 */
public class test8 {
    public static void main(String[] args) {
        int max = getMax(3,7,4);
        System.out.println("三个整数中的最大值为："+max);

    }

    public static int getMax(int a,int b,int c){
        if (a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        } else{
            return c;
        }

    }
}
