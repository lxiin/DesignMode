package chapter_2.simple;

import java.util.HashMap;

public class Client {
    public static void invoker(){
        Son father = new Son();
        HashMap map = new HashMap();
        father.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }
}
