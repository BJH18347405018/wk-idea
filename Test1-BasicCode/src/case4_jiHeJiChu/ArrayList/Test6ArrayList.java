package case4_jiHeJiChu.ArrayList;

import java.util.ArrayList;

/*
需求：现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
    请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。
 */
public class Test6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
