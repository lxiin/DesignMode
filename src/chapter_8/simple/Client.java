package chapter_8.simple;

import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.createProduct(ConcreteProduct1.class);
    }
}
