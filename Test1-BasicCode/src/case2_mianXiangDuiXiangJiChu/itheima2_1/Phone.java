package case2_mianXiangDuiXiangJiChu.itheima2_1;
/*
需求：定义一个手机类，然后定义一个手机测试类，在手机测试类中通过对象完成成员变量和成员方法的使用
 */
public class Phone {
    String brand;
    int price;

    public void call(String name){

        System.out.println("给"+name+"打电话");
    }

    public void sendMesssage(){
        System.out.println("群发短信");
    }
}
