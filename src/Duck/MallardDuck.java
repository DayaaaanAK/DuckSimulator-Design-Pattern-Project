package Duck;

import ObserverPattern.Observable;
import ObserverPattern.Observer;

public class MallardDuck extends Quackable {
    Observable observable;
    public MallardDuck(){
        this.species = "Mallard Duck";
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Mallard Duck quacks");
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
}
