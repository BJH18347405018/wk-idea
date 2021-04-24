package case1_java_jichu.method;
/*
需求：设计一个方法（print） 用于打印n到m之间所有的奇数
 */
public class test2 {
    public static void main(String[] args) {
        print(2,9);
    }

    public static void print(int n,int m) {
        if (n > m){
            System.out.println("您传入的数据有误，请检查！");
            return;
        }
        System.out.println(n+"到"+m+"之间的奇数为：");
        for (int i = n;i <= m;i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
