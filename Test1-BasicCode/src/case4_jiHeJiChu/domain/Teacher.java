package case4_jiHeJiChu.domain;
/*
需求：请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
姓名：赵老师, 专业：javase
姓名：钱老师, 专业：javaee
姓名：孙老师, 专业：php
姓名：李老师, 专业：python
 */
public class Teacher {
    private String name;
    private  String course;

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
