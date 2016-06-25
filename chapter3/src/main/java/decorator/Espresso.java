package decorator;

/**
 * It is espresso implementation
 */
public class Espresso extends Beverage {

    /**
     * Create a new instance of espresso
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * It method call from other class
     * @return - cost of espresso
     */
    @Override
    public double cost() {
        return 1.99f;
    }
}
