package observer;

/**
 * Created by ms on 2018. 6. 5..
 */
public class DaumMapObserver implements Observer, MapApi {
    private MapDataSubject mapDataSubject;
    private LonLat lonLat;

    public DaumMapObserver(MapDataSubject mapDataSubject) {
        this.mapDataSubject = mapDataSubject;
        this.mapDataSubject.addObserver(this);
    }

    @Override
    public void showToMap() {
        System.out.println("Daum Map ==");
        System.out.println(lonLat.getLonLat());
    }

    @Override
    public void update(LonLat lonLat) {
        this.lonLat = lonLat;
    }

    @Override
    public void doNotMonitoring() {
        this.mapDataSubject.removeObserver(this);
    }
}
