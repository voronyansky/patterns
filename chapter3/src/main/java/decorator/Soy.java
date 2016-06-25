package decorator;

/**
 * Implementation of soy addition
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    /**
     * Create an instance of soy addition
     * @param beverage
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Reuturn a description about beverage with soy addition and other additions
     * @return - String describes which contains info about addition
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    /**
     * It use for calculate price of bevarage with soy addition
     * @return
     */
    @Override
    public double cost() {
        return 3.22 + beverage.cost();
    }
}
