package Flock;

import Duck.Quackable;
import ObserverPattern.Observer;

import java.util.ArrayList;

public class Flock extends Quackable {
    ArrayList<Quackable> flock = new ArrayList<>();
    public void add(Quackable duck){
        flock.add(duck);
    }
    @Override
    public void quack() {
        for(Quackable ducks : flock){
            ducks.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable ducks : flock){
            ducks.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Quackable ducks : flock){
            ducks.notifyObservers();
        }
    }
}
