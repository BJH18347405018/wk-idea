package case3_API_jiChu.String;

/*
需求：字符串的比较epuals()比较内容

equalsIgnoreCase()不区分大小写
 */
public class test4 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
