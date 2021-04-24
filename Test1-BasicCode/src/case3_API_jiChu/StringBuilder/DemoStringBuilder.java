package case3_API_jiChu.StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {

        long stand = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 1;i <= 5000;i++){
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - stand);
        method();
    }

    private static void method() {
        String s = "";
        long stand = System.currentTimeMillis();
        for (int i = 1;i <= 5000;i++){
            s += i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end-stand);
    }
}
