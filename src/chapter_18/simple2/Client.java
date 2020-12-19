package chapter_18.simple2;

public class Client {

    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        String symbol = "+";

        Context context = null;
        if (symbol.equals(ADD_SYMBOL)){
            context = new Context(new Add());
        }else if (symbol.equals(SUB_SYMBOL)){
            context = new Context(new Sub());
        }

        System.out.println("运行结果为:--->"+context.exec(a,b,symbol));
    }
}
