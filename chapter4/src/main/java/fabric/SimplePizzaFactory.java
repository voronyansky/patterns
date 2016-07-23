package fabric;

/**
 * @author: voronyansky
 * @since: 25.06.2016
 */
public class SimplePizzaFactory {

    private Pizza pizza;

    public Pizza orderPizza(String type) {
        if(type.equals("cheese"))
            pizza = new CheesePizza("asd","asd","asd");
        else if(type.equals("pepperoni"))
            pizza = new PepperoniPizza("P","1","ad");
        return pizza;
    }
}
