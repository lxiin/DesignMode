package chapter_10;

public class HummerModel2 extends HummerModel{
    @Override
    public void start() {
        System.out.println("悍马H2...启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2...停止");

    }

    @Override
    public void alarm() {
        System.out.println("悍马H2...鸣笛");

    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2...引擎声音");

    }

}
