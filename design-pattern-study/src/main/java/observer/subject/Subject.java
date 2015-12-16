package observer.subject;

import observer.observer.Observer;

/**
 * Created by David Li on 2015/12/15.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
