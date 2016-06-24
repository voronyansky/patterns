package decorator;

/**
 * Created by Egor on 24.06.2016.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99f;
    }
}
