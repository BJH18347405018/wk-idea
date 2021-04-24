package case4_jiHeJiChu.ArrayList;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");

        list.add(2,"555");
        System.out.println(list);

    }
}
