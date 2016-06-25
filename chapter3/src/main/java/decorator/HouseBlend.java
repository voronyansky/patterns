package decorator;

/**
 * It is implementation of beverage
 */
public class HouseBlend extends Beverage {


    /**
     * Create an instance of house blend
     */
    public HouseBlend() {
        description = "House Blend";
    }

    /**
     * It uses for calculate price
     * @return cost of this beverage
     */
    @Override
    public double cost() {
        return 0.89f;
    }
}
