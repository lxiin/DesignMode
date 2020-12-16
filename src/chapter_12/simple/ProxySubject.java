package chapter_12.simple;

public class ProxySubject implements Subject {

    private Subject subject = null;

    public ProxySubject() {
        this.subject = new ProxySubject();
    }

    public ProxySubject(Object... objects){

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();

    }

    private void before(){

    }

    private void after(){}

}
