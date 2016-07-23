package singleton;

/**
 * Created by Andrey on 23.07.2016.
 */
public class ChocolateBoiler {

    private static ChocolateBoiler boiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if(boiler == null) {
            boiler = new ChocolateBoiler();
        }
        return boiler;
    }

    public void fill() {
        if(empty) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!empty && boiled) {
            empty  = true;
        }
    }

    public void boil() {
        if(!empty && !boiled) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}
