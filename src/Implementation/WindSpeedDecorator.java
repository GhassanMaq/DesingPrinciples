public class WindSpeedDecorator extends WeatherDisplayDecorator {
    private float windSpeed;
    public WindSpeedDecorator(WeatherDataObserver decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public void update(float temperature, float humidity, float windSpeed, float precipitation) {
        this.windSpeed = windSpeed;
        decoratedDisplay.update(temperature, humidity, windSpeed, precipitation);
        displayWindSpeed();
    }
    private void displayWindSpeed() {
        System.out.println("Wind Speed: " + windSpeed + " km/h");
    }
    private void display() {
        System.out.println("Wind Speed: " + windSpeed + " km/h");
    }

}
