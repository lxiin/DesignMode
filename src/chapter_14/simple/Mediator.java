package chapter_14.simple;

public abstract class Mediator {
    protected ConcreteColleauel1 c1;
    protected ConcreteColleauel1 c2;

    public ConcreteColleauel1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleauel1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleauel1 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleauel1 c2) {
        this.c2 = c2;
    }

    public abstract void doSomething1();
    public abstract void doSomething2();
}

