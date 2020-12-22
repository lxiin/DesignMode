package chapter_22.simple;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.doSomething();

    }

}
