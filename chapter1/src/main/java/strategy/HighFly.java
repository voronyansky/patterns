package strategy;

/**
 *  It high fly duck may fly at the high altitude
 *  It determine object behaviour
 */
public class HighFly implements FlyBehaviour {

    /**
     * It duck fly at the console
     */
    public void fly() {
        System.out.println("I am fly at the sky!");
    }
}
