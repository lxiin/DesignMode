package chapter_18.simple;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStategy1();
        Context context = new Context(strategy);
        context.doAnyThing();
    }
}
