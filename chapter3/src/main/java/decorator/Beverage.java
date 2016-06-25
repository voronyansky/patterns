package decorator;

/**
 * It is basic class for all beverage
 */
public abstract class Beverage {
    protected String description = "UNKNOWN BEVERAGE";


    /**
     * Return a description about beverage
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * It must be override in subclass
     * @return
     */
    public abstract double cost();
}
