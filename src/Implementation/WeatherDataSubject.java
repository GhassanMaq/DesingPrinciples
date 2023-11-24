import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject {
    private List<WeatherDataObserver> observers;
    private float temperature;
    private float humidity;
    private float windSpeed;
    private float precipitation;
    public WeatherDataSubject() {
        observers = new ArrayList<>();
    }
    public void addObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }
    public void setMeasurements(float temperature, float humidity, float windSpeed, float precipitation) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.precipitation = precipitation;
        notifyObservers();
    }
    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update(temperature, humidity, windSpeed, precipitation);
        }
    }

}
