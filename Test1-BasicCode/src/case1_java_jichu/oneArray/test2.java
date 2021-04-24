package case1_java_jichu.oneArray;
import java.util.Scanner;
/*
数组元素求和
需求：键盘录入5个整数，存储到数组中，并对数组求和。
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for(int i = 0;i < arr.length;i++){
            System.out.println("请输入第"+(i + 1)+"个整数");
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        System.out.println("数组中的和为："+sum);

    }


}
