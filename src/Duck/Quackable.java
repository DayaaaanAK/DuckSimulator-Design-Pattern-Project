package Duck;

import ObserverPattern.QuackObservable;

public abstract class Quackable implements QuackObservable {
    protected String species;
    public abstract void quack();
    public String getSpecies(){
        return  this.species;
    }
}
