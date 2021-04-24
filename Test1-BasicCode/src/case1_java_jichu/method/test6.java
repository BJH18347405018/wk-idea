package case1_java_jichu.method;
/*
需求：设计一个方法用于获取数组中元素的最大值
 */
public class test6 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println("数组中最大的值为："+max);
    }
    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
