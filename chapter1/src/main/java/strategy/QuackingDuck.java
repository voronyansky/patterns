package strategy;

/**
 * Quacking ducks, we determine quack behaviour of this duck
 * by assign the instance of class behaviour
 */
public class QuackingDuck extends Duck {

    public QuackingDuck() {
        quackBehaviour = new LoudQuack();
    }
}
