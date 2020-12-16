package chapter_14.simple;

public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.selfMedthod1();
        super.c2.selfMedthod1();
    }

    @Override
    public void doSomething2() {
//        super.c1.selfMedthod2();
//        super.c2.selfMedthod2();
    }
}
