package case2_mianXiangDuiXiangJiChu.itheima2_2;

public class TestGirlfriend {
    public static void main(String[] args) {
        Girlfriend girl = new Girlfriend();
        girl.setName("陈大猪");
        girl.setHeight(1.55);
        girl.setWeigth(84.00);

        girl.show();
        girl.wash();
        girl.cook();
    }
}
