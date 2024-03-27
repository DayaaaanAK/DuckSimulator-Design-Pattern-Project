package Factory;

import AbstractFactory.AbstractDuckFactory;
import Duck.ElizabethDuck;
import Duck.MallardDuck;
import Duck.Quackable;
import Wrapper.QuackCounter;

public class CountingDuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createElizabethDuck() {
        return new QuackCounter(new ElizabethDuck());
    }
}
