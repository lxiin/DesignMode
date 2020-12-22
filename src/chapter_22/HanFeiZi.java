package chapter_22;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi ,Observable{

    private ArrayList<Observer> observerList = new ArrayList<>();



    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了....");
        this.notifyObservers("韩非子在吃饭...");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了....");
        this.notifyObservers("韩非子在娱乐...");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList){
            observer.update(context);
        }
    }
}
