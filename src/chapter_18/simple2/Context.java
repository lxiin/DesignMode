package chapter_18.simple2;

public class Context {
    private Caculator cl = null;

    public Context(Caculator cl) {
        this.cl = cl;
    }

    public int exec(int a,int b,String symbol){
        return this.cl.exec(a, b);
    }
}
