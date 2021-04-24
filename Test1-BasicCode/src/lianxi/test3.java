package lianxi;

public class test3 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,8,7,6}};
        for (int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("###################");
        System.out.println();

        for (int a=0;a<=arr.length;a++){
            for (int b=0;b<arr.length;b++){
                System.out.print(arr[b][a]+"\t");
            }
            System.out.println();
        }
    }

}
