package Duck;

import ObserverPattern.Observable;
import ObserverPattern.Observer;

public class ElizabethDuck extends Quackable {
    Observable observable;
    public ElizabethDuck(){
        this.species = "Elizabeth Duck";
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Elizabeth Duck quacks");
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
