package case2_mianXiangDuiXiangJiChu.itheima2_2;
/*
需求： 1.按照以上要求定义Cat类和Dog类,属性要私有set和get方法
      2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
      3.调用成员方法,打印格式如下:
        花色的波斯猫正在吃鱼.....
        花色的波斯猫正在逮老鼠....
        黑色的藏獒正在啃骨头.....
        黑色的藏獒正在看家.....
 */
public class catAndDog {
    public static void main(String[] args) {
        Cat c = new Cat("花色","波斯猫");
        c.eat();
        c.catchMouse();

        Dog d = new Dog("黑色","藏獒");
        d.eat();
        d.lookHome();
    }
}
