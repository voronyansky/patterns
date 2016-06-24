package decorator;

/**
 * Created by Egor on 24.06.2016.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
