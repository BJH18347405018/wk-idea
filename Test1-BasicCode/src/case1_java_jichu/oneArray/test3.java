package case1_java_jichu.oneArray;

import java.util.Scanner;

/*
数组基本查找
需求：已知一个数组arr = {19,28,37,46,50};键盘录入一个一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值。
    如果对应的索引不存在，返回一个复数，用-1来表示。
 */
public class test3 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的元素：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
