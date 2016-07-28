package adapter;

/**
 * Model of concrete turkey.
 */
public class ConcreteTurkey implements  Turkey {


    public void gobble() {
        System.out.println("I going gobble");
    }

    public void fly() {
        System.out.println("I can dream, I can fly");
    }
}
