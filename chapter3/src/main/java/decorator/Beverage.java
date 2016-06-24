package decorator;

/**
 * Created by Egor on 24.06.2016.
 */
public abstract class Beverage {
    protected String description = "UNKNOWN BEVERAGE";


    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
