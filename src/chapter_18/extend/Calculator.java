package chapter_18.extend;

import java.util.Arrays;

public class Calculator {

    private final static String ADD_SYMBOL = "+";
    private final static String SUB_SYMBOL = "-";

    public int exec(int a,int b,String symbol){
        int result = 0;
        if (symbol.equals(ADD_SYMBOL)){
            result = this.add(a,b);
        }else if (symbol.equals(SUB_SYMBOL)){
            result = this.sub(a,b);
        }
        return result;
    }

    private int add(int a, int b){
        return a+b;
    }

    private int sub(int a,int b){
        return a - b;
    }

    public static void main(String[] args) {
        int a = 100;
        String symbol = "+";
        int b = 200;
        System.out.println("输入参数为:"+ Arrays.toString(args));
        Calculator calculator = new Calculator();
        System.out.println("运行结果为:"+a+symbol+b+"="+calculator.exec(a,b,symbol));
    }
}
