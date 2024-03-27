package ObserverPattern;

import Duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{
    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;
    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update((Quackable) duck);
        }
    }
}
