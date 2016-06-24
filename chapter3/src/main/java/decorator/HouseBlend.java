package decorator;

/**
 * Created by Egor on 24.06.2016.
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89f;
    }
}
