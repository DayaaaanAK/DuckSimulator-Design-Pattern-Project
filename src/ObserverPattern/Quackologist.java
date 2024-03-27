package ObserverPattern;

import Duck.Quackable;

public class Quackologist implements Observer{
    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist: " + duck.getSpecies() + " just quacked.");
    }
}
