public class CurrentConditionsDisplay implements WeatherDataObserver {
    private String temperatureUnit = "C"; // Default unit
    public void setTemperatureUnit(String unit) {
        this.temperatureUnit = unit;
    }
    @Override
    public void update(float temperature, float humidity, float windSpeed, float precipitation) {
        System.out.println("Current conditions: " + temperature + temperatureUnit + " degrees and " + humidity + "% humidity");
    }
}
