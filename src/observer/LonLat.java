package observer;

/**
 * Created by ms on 2018. 6. 5..
 */
public class LonLat {
    public LonLat() { }
    public LonLat(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    private double lon;
    private double lat;

    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getLonLat() {
        return "lon: " + lon + ", lat: " + lat;
    }
}
