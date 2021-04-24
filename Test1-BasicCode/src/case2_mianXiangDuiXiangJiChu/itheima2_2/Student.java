package case2_mianXiangDuiXiangJiChu.itheima2_2;
/*
需求：把成员变量用private修饰
    提供对应的setXxx()/getXxx()方法
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name){
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        }else {
            System.out.println("您输入的年龄有误");
        }

    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+"....."+age);
    }

}
