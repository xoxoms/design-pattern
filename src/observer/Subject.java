package observer;

/**
 * Created by ms on 2018. 6. 5..
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyToObservers();
}
