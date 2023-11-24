public class PrecipitationDecorator extends WeatherDisplayDecorator {
    private float precipitation;
    public PrecipitationDecorator(WeatherDataObserver decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public void update(float temperature, float humidity, float windSpeed, float precipitation) {
        this.precipitation = precipitation;
        decoratedDisplay.update(temperature, humidity, windSpeed, precipitation);
        display();
    }
    private void display() {
        System.out.println("Precipitation: " + precipitation + " mm");
    }

}
