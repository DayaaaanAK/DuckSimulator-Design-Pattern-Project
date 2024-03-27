package AbstractFactory;

import Duck.Quackable;

public interface AbstractDuckFactory {
    Quackable createMallardDuck();
    Quackable createElizabethDuck();
}
