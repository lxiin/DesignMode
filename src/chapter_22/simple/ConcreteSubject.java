package chapter_22.simple;

public class ConcreteSubject extends Subject {

    public void doSomething(){
        super.notifyObserver();
    }
}
