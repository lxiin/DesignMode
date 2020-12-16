package chapter_12.simple3;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do Something------>"+str);
    }
}
