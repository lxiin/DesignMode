package chapter_19.simple;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("If you need any help,please call me!");
    }
}
