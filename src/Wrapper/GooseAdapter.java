package Wrapper;

import Duck.Quackable;
import Goose.Goose;
import ObserverPattern.Observable;
import ObserverPattern.Observer;

public class GooseAdapter extends Quackable {
    Goose goose;
    Observable observable;
    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String getSpecies(){
        return goose.getSpecies();
    }
}
