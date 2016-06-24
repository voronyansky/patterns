package decorator;

/**
 * Created by Egor on 24.06.2016.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
