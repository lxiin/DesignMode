package chapter_11;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequene = new ArrayList<>();
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        for (int i = 0; i < sequene.size(); i++){
            String actionName = sequene.get(i);
            if (actionName.equalsIgnoreCase("start")){
                this.start();
            }else if (actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if (actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if (actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequene(ArrayList<String> sequene){
        this.sequene = sequene;
    }
}
