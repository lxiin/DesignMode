package chapter_16;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
//        for (IWomen women : arrayList){
//            if (women.getType() == 1){
//                System.out.println("------女儿向父亲请示:-------");
//                father.handlerMessage(women);
//            }else if (women.getType() == 2){
//                System.out.println("------妻子向丈夫请示---------");
//                husband.handlerMessage(women);
//            }else if (women.getType() == 3){
//                System.out.println("------母亲向儿子请示---------");
//                son.handlerMessage(women);
//            }else {
//
//            }
//        }
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen w :
                arrayList) {
            father.handlerMessage(w);
        }
    }
}
