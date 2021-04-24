package case3_API_jiChu.String;
/*
String常见的构造方法

public String():创建一个空白的字符串对象，不含有任何内容
public String(char[] chs):根据字符数组的内容，来创建字符串的对象
public String(String original):根据传入的字符内容，来创建字符串对象
String s = "abc";直接赋值的方式创建字符串对象，内容就是abc
 */
public class test3 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String("1234");
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s4);
    }
}
