# DesingPrinciples
# Design Patterns Used:
# Observer Pattern:
This pattern is needed for weather monitoring system to enable multiple displays to update when weather data changes.

Classes used for the pattern:

WeatherDataSubject: the subject class with weather data and responsiple for notifying observers of changes.
WeatherDataObserver (Interface): define the update method.
CurrentConditionsDisplay and StatisticsDisplay: observers that display curent weather.


# Decorator Pattern
To add new functionalities dynamically without changing the structure. This pattern is needed for adding features like diferent temp units wind speed  and precipitation information.
Classes used for the pattern:

WeatherDisplayDecorator (Abstract Class): decorator implements the WeatherDataObserver.
Concrete Decorators: like TemperatureUnitsDecorator, WindSpeedDecorator, and PrecipitationDecorator extends WeatherDisplayDecorator.

Class Diagram:

![Alt text](<Class Diagram.png>)





Loose Coupling: The Observer pattern allow for loose coupling between the subject and observer.
Dynamic Behavior: The Decorator pattern enable to dynamically changing the behavior of the display.
