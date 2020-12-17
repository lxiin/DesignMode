package chapter_15.simple;

public class Client {


    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }

}
