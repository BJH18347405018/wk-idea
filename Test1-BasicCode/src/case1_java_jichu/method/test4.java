package case1_java_jichu.method;
/*
需求：使用方法重载的思想，设计比较俩个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
 */
public class test4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(compare(3,5));

    }
    public static boolean compare(int n,int m){
        return n == m;
    }

    public static boolean compare(byte n,byte m){
        return n == m;
    }

    public static boolean compare(short n,short m){
        return n == m;
    }

    public static boolean compare(long n,long m){
        return n == m;
    }
}
