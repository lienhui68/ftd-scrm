package observer;

import observer.observer.impl.CurrentConditionDisplay;
import observer.observer.impl.StatisticsDisplay;
import observer.subject.impl.WeatherData;

/**
 * Created by David Li on 2015/12/15.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(1.1f, 1.2f, 1.3f);
    }
}
