package case1_java_jichu.oneArray;

import java.util.Scanner;

/*
评委打分
需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0~100的整数分，
      选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                arr[i] = score;
            }else{
                System.out.println("请输入0~100之间的整数：");
                i--;
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = (sum - max - min)/(arr.length-2);

        System.out.println("选手的最后得分为："+avg);

    }
}
