package strategy;

/**
 * It is flying duck it my flying:)
 */
public class FlyingDuck extends Duck {

    public FlyingDuck() {
        flyBehaviour = new HighFly();
    }
}
