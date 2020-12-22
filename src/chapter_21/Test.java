package chapter_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C", "D", "E");
        List<String> list1 = new ArrayList<>();
        list1.addAll(strings);
        List<String> strings1 = Arrays.asList("A", "1", "2", "3", "D", "4");
        List<String> list2 = new ArrayList<>();
//        list2.addAll(strings1);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
