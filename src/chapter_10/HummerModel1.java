package chapter_10;

public class HummerModel1  extends HummerModel{

    private boolean alarmFlag = true;


    @Override
    public void start() {
        System.out.println("悍马H1...启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1...停止");

    }

    @Override
    public void alarm() {
        System.out.println("悍马H1...鸣笛");

    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1...引擎声音");

    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
