package case2_mianXiangDuiXiangJiChu.itheima2_2;
/*
需求：成员变量
       使用private修饰
     构造方法
        提供一个无参构造方法
        提供一个有参构造方法
     成员变量方法
        提供每一个成员变量对应的setXxx()/getXxx()
        提供一个显示对象信息的show()
     创建对象并为其成员变量赋值的俩种方式
        无参构造方法创建对象后使用setXxx()赋值
        使用有参构造方法直接创建带有属性的对象

        JavaBean类：封装数据
 */
public class Method {
    private String name;
    private int age;
    private double weigth;

    public Method() {

    }
    public Method(String name, int age, double weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void show(){
        System.out.println(name+"...."+age+"..."+weigth);
    }
}



