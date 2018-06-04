package observer;

/**
 * Created by ms on 2018. 6. 5..
 */
public class MapDataChanger {
    public static void main(String[] args) {
        // 위경도를 관리하는 주제 객체를 생성한다.
        MapDataSubject mapDataSubject = new MapDataSubject();
        // 다음, 네이버, 구글 세 맵 API를 생성하고 내부적으로 위경도 관리 주제 객체를 구독하도록 한다.
        DaumMapObserver daumMapObserver = new DaumMapObserver(mapDataSubject);
        NaverMapObserver naverMapObserver = new NaverMapObserver(mapDataSubject);
        GoogleMapObserver googleMapObserver = new GoogleMapObserver(mapDataSubject);

        // 주제 객체는 위경도가 변경되면, 자신을 의존하고 있는 옵저버에게 변경 내용을 전달한다.
        mapDataSubject.lonLatChanged(new LonLat(33.1234, 127.4432));
        daumMapObserver.showToMap();
        naverMapObserver.showToMap();
        googleMapObserver.showToMap();

        mapDataSubject.lonLatChanged(new LonLat(35.1234, 123.4432));
        daumMapObserver.showToMap();
        naverMapObserver.showToMap();
        googleMapObserver.showToMap();

        // 다음과 네이버는 더 이상 주제 객체를 구독하지 않는다.
        daumMapObserver.doNotMonitoring();
        naverMapObserver.doNotMonitoring();
        mapDataSubject.lonLatChanged(new LonLat(0, 0));

        // 다음과 네이버 맵 API는 위경도 변경을 구독하지 않았기 때문에 위에서 0, 0이 아닌 35.1234, 123.4432가 보여진다.
        daumMapObserver.showToMap();
        naverMapObserver.showToMap();
        googleMapObserver.showToMap();
    }
}
