package chapter_10.simple;

public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }
}
