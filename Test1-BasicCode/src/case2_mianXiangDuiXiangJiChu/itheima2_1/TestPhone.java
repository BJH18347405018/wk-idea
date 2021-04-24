package case2_mianXiangDuiXiangJiChu.itheima2_1;

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "红米";
        p.price = 1999;
        System.out.println(p.brand+"..."+p.price);

        p.call("阿强");
        p.sendMesssage();

    }
}
