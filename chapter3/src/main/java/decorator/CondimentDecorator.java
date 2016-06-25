package decorator;

/**
 *  It is decorator. Using this for expand beverage
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
