package observer;

/**
 * Created by ms on 2018. 6. 5..
 */
public interface Observer {
    void update(LonLat lonLat);
    void doNotMonitoring();
}
