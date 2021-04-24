package case1_java_jichu.method;
/*
需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]
 */
public class test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        array(arr);

    }
    public static void array(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }

        }
    }


}
