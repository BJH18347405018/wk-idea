package case1_java_jichu.oneArray;
/*
数组获取最值
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = arr[0];
        for(int x = 0;x < arr.length;x++){
            if(arr[x] > max){
                max = arr[x];
          }
      }
        System.out.println("数组的最大值为："+max);
        System.out.println("------------");

        int min = arr[0];
      for(int x = 0;x < arr.length;x++){
          if (arr[x] < min){
              min = arr[x];
          }
      }
        System.out.println("数组的最小值为："+min);
    }
}
