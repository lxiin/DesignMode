package chapter_3;

public class Client {
    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        zhangSan.drive(new BMW());
    }
}
