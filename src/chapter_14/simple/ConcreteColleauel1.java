package chapter_14.simple;

public class ConcreteColleauel1 extends Colleague {

    public ConcreteColleauel1(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMedthod1(){
        //处理自己的逻辑
    }

    public void depMedthod1(){
        super.mediator.doSomething1();
    }
}
