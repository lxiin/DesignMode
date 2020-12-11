package chapter_8;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人说话，一般都是单字节的");
    }
}
