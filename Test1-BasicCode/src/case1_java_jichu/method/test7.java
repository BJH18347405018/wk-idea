package case1_java_jichu.method;
/*
需求：设计一个方法，该方法能够同时获取数组的最大值，和最小值。
 */
public class test7 {
    public static void main(String[] args) {
        int[] arr = {13, 24, 35, 46, 57, 68};
        int[] maxAndMin = array(arr);
        System.out.println("数组的最大值为："+maxAndMin[0]);
        System.out.println("数组的最小值为："+maxAndMin[1]);
    }
    public static int[] array ( int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int[] maxAndMin = {max, min};
        return maxAndMin;
    }

}