package case2_mianXiangDuiXiangJiChu.itheima2_2;
/*
需求：定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
 */
public class Cat {
    private String color;
    private String bread;

    public Cat(String color, String bread) {
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
        System.out.println(color+"的"+bread+"正在吃鱼...");
    }

    public void catchMouse(){
        System.out.println(color+"的"+bread+"正在抓老鼠...");
    }
}
