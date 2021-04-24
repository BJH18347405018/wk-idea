package case4_jiHeJiChu.ArrayList;

import java.util.ArrayList;

public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);

        String s3 = list.get(2);
        System.out.println(s3);

        int size = list.size();
        System.out.println(size);
        method();
        method1();
    }

    private static void method1() {
        ArrayList<String > list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);

        String s2 = list.set(0,"000");
        System.out.println(s2);
        System.out.println(list);
    }

    private static void method() {
        ArrayList<String > list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);

        boolean b1 = list.remove("111");
        boolean b2 = list.remove("zzz");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);

        String s1 = list.remove(0);
        System.out.println(s1);
        System.out.println(list);
    }
}
