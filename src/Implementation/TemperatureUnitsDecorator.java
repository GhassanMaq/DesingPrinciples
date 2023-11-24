public class TemperatureUnitsDecorator extends WeatherDisplayDecorator {
    public TemperatureUnitsDecorator(WeatherDataObserver decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public void update(float temperature, float humidity, float windSpeed, float precipitation) {
        float temperatureInFahrenheit = convertToFahrenheit(temperature);
        if (decoratedDisplay instanceof CurrentConditionsDisplay) {
            ((CurrentConditionsDisplay) decoratedDisplay).setTemperatureUnit("F");
        }
        decoratedDisplay.update(temperatureInFahrenheit, humidity, windSpeed, precipitation);
    }
    private float convertToFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }
}
