package observer.observer.impl;

import observer.ext.DisplayElement;
import observer.observer.Observer;
import observer.subject.Subject;

/**
 * Created by David Li on 2015/12/15.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temprature, float humidity, float preassure) {
        this.temperature = temprature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Current conditions:%ntemperature->%f\thumidity->%f%n", temperature, humidity);
    }

}
