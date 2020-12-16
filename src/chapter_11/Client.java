package chapter_11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        benzModel.setSequene(sequence);
        benzModel.run();
    }
}
