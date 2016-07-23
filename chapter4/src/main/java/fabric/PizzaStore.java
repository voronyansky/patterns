package fabric;

/**
 * @author: voronyansky
 * @since: 25.06.2016
 */
abstract class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    public PizzaStore() {

    }
    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Create a pizza by choose in dependency.
     * @param type name of pizza.
     * @return new pizza.
     */
    public abstract Pizza createPizza(String type);


}
