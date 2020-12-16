package chapter_14.simple;

public class ConcreteColleauel2 extends Colleague {

    public ConcreteColleauel2(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMedthod1(){
        //处理自己的逻辑
    }

    public void depMedthod1(){
        super.mediator.doSomething1();
    }
}
