package chapter_22.simple;

import java.util.Vector;

public abstract class Subject {
    protected Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer o : observers){
            o.update();
        }
    }

}
