package Wrapper;

import Duck.Quackable;
import ObserverPattern.Observer;

public class QuackCounter extends Quackable {
    Quackable duck;
    private int quackCount = 0;
    private static int totalQuackCount = 0;
    public QuackCounter(Quackable duck){
        this.duck = duck;
    }
    public void quack(){
        quackCount++;
        totalQuackCount++;
        duck.quack();
        quackCount();
    }

    public void quackCount(){
        System.out.println(duck.getSpecies() + " quacked " + quackCount + " times in total\n");
    }
    public static void getCount()
    {
        System.out.println("\nTotal number of quacks: " + totalQuackCount);
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
