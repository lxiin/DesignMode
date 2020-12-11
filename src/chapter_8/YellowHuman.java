package chapter_8;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色人的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人说话一般说的都是双字节的");
    }
}
