package case1_java_jichu.method;
/*
需求：设计一个方法method,方法中定义一个变量（数值随意）
    判断这个变量是奇数还是偶数，并在main方法中调用method
 */
public class test1 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int a = 36;
        if (a % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }

    }

}

