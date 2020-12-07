package chapter_2.simple;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son {
    public Collection doSomething(HashMap map){
        System.out.println("子类被执行..");
        return map.values();
    }
}
