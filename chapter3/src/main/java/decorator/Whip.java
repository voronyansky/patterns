package decorator;

/**
 * Implementation of whip addition
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    /**
     * It create an instance of addition
     * @param beverage instance of beverage
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Return a string which describe beverage with whip addition and other additions
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }


    /**
     * It calculate price of beverage with addition
     * @return
     */
    @Override
    public double cost() {
        return 0.65 + beverage.cost();
    }
}
