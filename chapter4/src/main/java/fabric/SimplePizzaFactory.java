package fabric;

/**
 * @author: voronyansky
 * @since: 25.06.2016
 */
public class SimplePizzaFactory {

    private Pizza pizza;

    public Pizza orderPizza(String type) {
        if(type.equals("cheese"))
            pizza = null;
        else if(type.equals("pepperoni"))
            pizza = null;
        return pizza;
    }
}
