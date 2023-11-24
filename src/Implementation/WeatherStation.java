public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(statisticsDisplay);
        WeatherDataObserver decoratedCurrentDisplay = new TemperatureUnitsDecorator(currentDisplay);
        decoratedCurrentDisplay = new WindSpeedDecorator(decoratedCurrentDisplay);
        decoratedCurrentDisplay = new PrecipitationDecorator(decoratedCurrentDisplay);
        weatherData.setMeasurements(25, 65, 10, 5);
        decoratedCurrentDisplay.update(25, 65, 10, 5);
    }
}
