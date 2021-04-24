package case3_API_jiChu.String;

public class test2 {
    public static void main(String[] args) {
        //String是常量，  它们的值在创建之后是不能更改的
        String str = "abc123";
        int length = str.length();
        System.out.println(length);

        str = "def";//这一步是让str这个字符串类型的变量，记录了一个新的对象.
        System.out.println(str);
    }
}
