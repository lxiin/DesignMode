package chapter_5;

import java.util.Random;

public class Wizard {
    private Random random = new Random(System.currentTimeMillis());

    public int first(){
        System.out.println("执行第一个方法....");
        return random.nextInt(100);
    }

    public int second(){
        System.out.println("执行第二个方法...");
        return random.nextInt(100);
    }

    public int third(){
        System.out.println("执行第三个方法...");
        return random.nextInt(100);
    }

    public void installWizard(){
        int first = this.first();
        if (first > 50){
            int second = this.second();
            if (second > 50){
                int third = this.third();
                if (third > 50){
                    this.first();
                }
            }
        }
    }
}
