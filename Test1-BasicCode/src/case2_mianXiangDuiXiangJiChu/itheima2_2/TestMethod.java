package case2_mianXiangDuiXiangJiChu.itheima2_2;

public class TestMethod {
    public static void main(String[] args) {
        Method m1 = new Method();
        m1.setName("张三");
        m1.setAge(23);
        m1.setWeigth(1.75);

        m1.show();

        Method m2 = new Method("李四",24,1.80);
        m2.show();
    }
}
