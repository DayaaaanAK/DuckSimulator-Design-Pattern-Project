import AbstractFactory.*;
import Duck.*;
import Factory.*;
import Flock.Flock;
import Wrapper.*;
import ObserverPattern.*;

public class DuckSimulator {
    public static void main (String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable elizabethDuck = duckFactory.createElizabethDuck();
        Quackable snowGoose = gooseFactory.createSnowGoose();
        Quackable canadianGoose = gooseFactory.createCanadianGoose();

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(elizabethDuck);

        Flock flockOfGeese = new Flock();
        flockOfGeese.add(snowGoose);
        flockOfGeese.add(canadianGoose);

        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nFlock of Ducks:");
        simulate(flockOfDucks);

        System.out.println("\nFlock of Geese:");
        simulate(flockOfGeese);

        QuackCounter.getCount();
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
