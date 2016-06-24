package observer;

/**
 *  Launcher for testing observer pattern
 *  @author: voronyansky
 *  @since: 24.06.2016
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(10f,11f,21f);
        weatherData.setMeasurement(11f,19f,213f);
        weatherData.setMeasurement(12f,3f,4f);

    }
}
