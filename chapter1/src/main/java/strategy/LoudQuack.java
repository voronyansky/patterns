package strategy;

/**
 *  Loud quacking duck. It determine how to object behaviour
 */
public class LoudQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("Quack - quack, motherfucker!");
    }
}
