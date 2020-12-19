package chapter_18.simple;

public class ConcreteStategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则....");
    }
}
