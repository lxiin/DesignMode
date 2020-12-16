package chapter_11;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private  BMWModel bmw = new BMWModel();


    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequene(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
