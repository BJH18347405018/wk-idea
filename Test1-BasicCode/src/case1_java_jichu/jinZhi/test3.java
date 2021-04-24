package case1_java_jichu.jinZhi;
/*
需求：已知以一个数组arr={19,28,37,46,50};用程序实现把数组中的元素值交换
    交换后的数组arr={50,46,37,28,19};并在控制台输出交换后的数组元素
 */
public class test3 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        for (int start = 0,end = arr.length-1;start < end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        array(arr);
    }
    public static void array(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+" ,");
            }
        }
    }
}
