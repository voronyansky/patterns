package strategy;

/**
 * Testing of strategy pattern
 */
public class Starter {

    public static void main(String[] args) {
        Duck duck = new FlyingDuck();
        duck.performFly();
        duck = new QuackingDuck();
        duck.performQuack();

    }
}
