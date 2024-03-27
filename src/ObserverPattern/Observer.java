package ObserverPattern;

import Duck.Quackable;

public interface Observer {
    void update(Quackable duck);
}
