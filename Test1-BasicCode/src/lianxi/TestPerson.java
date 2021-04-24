package lianxi;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name="张三";

        p1.age=18;

        Person p2 = new Person();

        p2.name="李四";

        p2.age=28;

        p1.showName("Hello");

        p1.showAge(99);

        p2.showName("World");

        p2.showAge(100);

    }
}
