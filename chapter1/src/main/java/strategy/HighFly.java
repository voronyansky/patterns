package strategy;

/**
 *  It high fly duck may fly at the high altitude
 *  It determine object behaviour
 */
public class HighFly implements FlyBehaviour {

    public void fly() {
        System.out.println("I am fly at the sky!");
    }
}
