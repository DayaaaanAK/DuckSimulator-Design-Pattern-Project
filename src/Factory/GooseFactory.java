package Factory;

import AbstractFactory.AbstractGooseFactory;
import Duck.Quackable;
import Goose.CanadianGoose;
import Goose.SnowGoose;
import Wrapper.GooseAdapter;

public class GooseFactory implements AbstractGooseFactory {
    @Override
    public Quackable createCanadianGoose() {
        return new GooseAdapter(new CanadianGoose());
    }

    @Override
    public Quackable createSnowGoose() {
        return new GooseAdapter(new SnowGoose());
    }
}
