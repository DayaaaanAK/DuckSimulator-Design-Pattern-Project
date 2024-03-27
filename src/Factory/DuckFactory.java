package Factory;

import AbstractFactory.AbstractDuckFactory;
import Duck.ElizabethDuck;
import Duck.MallardDuck;
import Duck.Quackable;

public class DuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createElizabethDuck() {
        return new ElizabethDuck();
    }
}
