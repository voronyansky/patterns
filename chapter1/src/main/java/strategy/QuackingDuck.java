package strategy;

/**
 * Created by Egor on 24.06.2016.
 */
public class QuackingDuck extends Duck {

    public QuackingDuck() {
        quackBehaviour = new LoudQuack();
    }
}
