package observer.observer.impl;

import observer.ext.DisplayElement;
import observer.observer.Observer;
import observer.subject.Subject;

/**
 * Created by David Li on 2015/12/15.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float preassure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Statistics:%ntemperature->%f\thumidity->%f%n", temperature, humidity);
    }

}
