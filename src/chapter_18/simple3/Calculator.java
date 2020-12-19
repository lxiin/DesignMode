package chapter_18.simple3;

import chapter_18.simple2.Caculator;

public enum  Calculator {
    ADD("+"){
        public int exec(int a, int b){
            return a+b;
        }
    },

    SUB("-"){
        public int exec(int a, int b){
            return a - b;
        }
    };

    String value = "";

    private Calculator(String _value){
        this.value = _value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a,int b);
}
