public abstract class WeatherDisplayDecorator implements WeatherDataObserver {
    protected WeatherDataObserver decoratedDisplay;
    public WeatherDisplayDecorator(WeatherDataObserver decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }
    @Override
    public abstract void update(float temperature, float humidity, float windSpeed, float precipitation);
}
