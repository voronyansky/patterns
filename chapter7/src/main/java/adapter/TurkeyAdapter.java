package adapter;

/**
 * Adapter pattern.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    /**
     * Create a new turkey adapter for duck class.
     * @param turkey reference to object.
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void fly() {
        turkey.fly();
    }

    public void quack() {
        turkey.gobble();
    }
}
