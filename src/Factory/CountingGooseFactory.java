package Factory;

import AbstractFactory.AbstractGooseFactory;
import Duck.Quackable;
import Goose.CanadianGoose;
import Goose.SnowGoose;
import Wrapper.GooseAdapter;
import Wrapper.QuackCounter;

public class CountingGooseFactory implements AbstractGooseFactory {
    @Override
    public Quackable createCanadianGoose() {
        return new QuackCounter(new GooseAdapter(new CanadianGoose()));
    }

    @Override
    public Quackable createSnowGoose() {
        return new QuackCounter(new GooseAdapter(new SnowGoose()));
    }
}
