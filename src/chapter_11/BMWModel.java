package chapter_11;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动....");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止....");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马响铃....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎声音....");

    }
}
