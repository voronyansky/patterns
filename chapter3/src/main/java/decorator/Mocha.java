package decorator;

/**
 * It is decorator for mocha addition
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    /**
     * Create an instance of mocha addition
     * @param beverage - instance of beverage class
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Return a description about this addition
     * @return - String describes about this addition
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", mocha";
    }

    /**
     * It method calls for calculate price
     * @return - cost of mocha addition
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
