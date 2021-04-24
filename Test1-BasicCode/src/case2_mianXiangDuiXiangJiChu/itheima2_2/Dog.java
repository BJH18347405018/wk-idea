package case2_mianXiangDuiXiangJiChu.itheima2_2;
/*
需求：定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
 */
public class Dog {
    private String color;
    private String bread;

    public Dog(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void eat(){
        System.out.println(color+"的"+bread+"正在啃骨头...");
    }

    public void lookHome(){
        System.out.println(color+"的"+bread+"正在看家...");
    }
}
