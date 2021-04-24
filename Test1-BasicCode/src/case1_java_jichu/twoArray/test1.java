package case1_java_jichu.twoArray;
/*
需求：已知一个二维数组arr = {{11，22，33}，{33，44，55}};遍历该数组，取出所有元素并打印
 */
public class test1 {
    public static void main(String[] args) {
        int[][] arr = {{11,22,33},{33,44,55}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
