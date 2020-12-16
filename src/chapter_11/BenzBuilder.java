package chapter_11;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();


    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequene(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
