public interface WeatherDataObserver {
    void update(float temperature, float humidity, float windSpeed, float precipitation);
}
