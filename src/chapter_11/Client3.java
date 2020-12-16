package chapter_11;

public class Client3 {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10000;i++){
            director.getABenzModel().run();
        }

        for (int i = 0; i < 100000;i++){
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 10000; i++){
            director.getCBMWModel().run();
        }
    }
}
