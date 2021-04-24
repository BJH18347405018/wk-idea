package case2_mianXiangDuiXiangJiChu.itheima2_1;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 23;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.study();

    }
}
