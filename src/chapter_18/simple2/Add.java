package chapter_18.simple2;

import chapter_18.extend.Calculator;

public class Add implements Caculator {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
