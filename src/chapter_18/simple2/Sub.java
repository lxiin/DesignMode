package chapter_18.simple2;

public class Sub implements Caculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
