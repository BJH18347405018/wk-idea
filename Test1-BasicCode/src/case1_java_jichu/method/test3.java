package case1_java_jichu.method;
/*
需求：设计一个方法可以获取俩个数的较大值，数据来自于参数
 */
public class test3 {
    public static void main(String[] args) {
        int max = getMax(3,6);
        System.out.println("最大数值为："+max);
    }
    public static int getMax(int n,int m) {
        if (n > m){
            return n;
        }else{
            return m;
        }

    }



}
