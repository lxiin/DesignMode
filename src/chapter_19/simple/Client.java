package chapter_19.simple;

public class Client {
    public static void main(String[] args) {
        Target target =new ConcreteTarget();
        target.request();
        Target target1 = new Adapter();
        target1.request();
    }
}
