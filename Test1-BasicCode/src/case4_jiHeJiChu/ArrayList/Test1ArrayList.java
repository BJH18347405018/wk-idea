package case4_jiHeJiChu.ArrayList;

import java.util.ArrayList;

/*
存储字符串并遍历
需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
 */
public class Test1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        for (int i = 0; i < list.size(); i++) {
            String  s = list.get(i);
            System.out.println(s);
        }

    }
}
