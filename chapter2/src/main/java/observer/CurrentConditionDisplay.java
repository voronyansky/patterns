package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Implement of observer, it is screen of now time condition
 * @author: voronyansky
 * @sicnce: 24.06.2016
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    /**
     * Holding a subject and other data such as temp, humidity
     */
    private Observable observable;
    private float temp;
    private float humidity;

    /**
     * We need to save reference to our subject
     * @param observable - reference to object which implement interface Observable
     */
    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * Show data at the console
     */
    public void display() {
        System.out.println("At this moment temp is " + this.temp + " and humidity is " + this.humidity);
    }

    /**
     * Update data at this implementation of observer
     * @param o - it is instance of observable screen
     * @param args - if you want get some more info use this param, but at
     *               this implementation it is have nothing value
     */
    public void update(Observable o, Object args) {
        if(o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            this.temp = data.getTemp();
            this.humidity = data.getHumidity();
            display();
        }
    }
}
