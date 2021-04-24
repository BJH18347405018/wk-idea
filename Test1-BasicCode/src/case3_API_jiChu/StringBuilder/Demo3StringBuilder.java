package case3_API_jiChu.StringBuilder;

public class Demo3StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        sb.append("红色");
//        System.out.println(sb);
//        sb.append("蓝色");
//        System.out.println(sb);
//        sb.append("黄色");
//        System.out.println(sb);

        //链式编程：如果一个方法返回的是对象类型，对象就可以继续向下调用方法
        sb.append("红色").append("黄色").append("蓝色");
        System.out.println("反转前："+sb);

        sb.reverse();
        System.out.println("反转后:"+sb);

        int ss = sb.length();
        System.out.println("sb中字符串的个数为："+ss);

        String sss = sb.toString();
        System.out.println(sss);
    }
}
