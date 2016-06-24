package strategy;

/**
 * It is a common base class for all ducks
 * All duck have a fly behaviour and fly behaviour
 * You may change its by setter at this class
 */
public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    /**
     * Using for creating concrete implementation of duck
     */
    public Duck() {

    }

    /**
     * Call method fly from the class which determine
     * fly behaviour
     */
    public void performFly() {
        flyBehaviour.fly();
    }

    /**
     * Call method behaviour the class which determine
     * quack behaviour
     */
    public void performQuack() {
        quackBehaviour.quack();
    }

    /**
     * If you want change behaviour dynamic you should use
     * this method to change fly behaviour of duck
     * @param flyBehaviour - implementation of FlyBehaviour interface
     */
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    /**
     * If you want change quack behaviour you should use
     * this method to change quack behaviour of duck
     * @param quackBehaviour - implementation of QuackBehaviour interface
     */
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}
