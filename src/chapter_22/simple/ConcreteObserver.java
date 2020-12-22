package chapter_22.simple;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到消息，并进行处理!");
    }
}
