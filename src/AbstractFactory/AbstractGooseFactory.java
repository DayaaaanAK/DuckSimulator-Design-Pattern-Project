package AbstractFactory;

import Duck.Quackable;

public interface AbstractGooseFactory {
    Quackable createCanadianGoose();
    Quackable createSnowGoose();
}
