package chapter_10;

public abstract class HummerModel {


    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run(){
        this.start();
        this.engineBoom();
        if (isAlarm()){
            this.alarm();
        }
        this.stop();
    }


    protected boolean isAlarm(){
        return true;
    }
}
