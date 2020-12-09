package chapter_7;

public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor(){

    }

    public static Emperor getInstance(){
        return emperor;
    }

    public static void say(){
        System.out.println("我就是皇帝某某某..");
    }
}
