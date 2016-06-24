package observer;


import java.util.Observable;

/**
 *  It is subject of observer pattern
 *  This push a new data to observer
 *  @author: voronyansky
 *  @since: 24.06.2016
 */
public class WeatherData extends Observable {

    /**
     * It is data of weather station
     */
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
    }

    /**
     * Notify all of our observer
     * @param obj
     * @param args
     */
    public void notifyObservers(Object obj,Object args) {
        notifyObservers(obj);
    }

    /**
     * If someone call this method
     * We need to update data and change
     */
    public void measurementChanged() {
        setChanged();
        notifyObservers(this, null);
    }

    /**
     * Use this method to update all component in one times
     * @param temperature - it is measured temp from electronics
     * @param humidity - it is measured humidity from electronics
     * @param pressure - it is measured pressure form electronics
     */
    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    /**
     * It is return a current temp
     * @return measured value of temp
     */
    public float getTemp() {
        return this.temperature;
    }

    /**
     * It is return a current humidity
     * @return measured value of humidity
     */
    public float getHumidity() {
        return this.humidity;
    }

    /**
     * It is return a current pressure
     * @return value of pressure
     */
    public float getPressure() {
        return this.pressure;
    }
}
