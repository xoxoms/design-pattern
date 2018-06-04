package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ms on 2018. 6. 5..
 */
public class MapDataSubject implements Subject {
    private List<Observer> observers;
    private LonLat lonLat;

    public MapDataSubject() {
        this.observers = new ArrayList<>();
        this.lonLat = new LonLat();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyToObservers() {
        observers.forEach(e -> e.update(lonLat));
    }

    public void lonLatChanged(LonLat lonLat) {
        this.lonLat = lonLat;
        notifyToObservers();
    }
}
