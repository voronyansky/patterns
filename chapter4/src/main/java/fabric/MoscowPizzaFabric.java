package fabric;

/**
 * @author evrnsky
 * @since 23.07.2016
 */
public class MoscowPizzaFabric extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("Moscow")) {
            pizza =  new MoscowPizza("Moscow Pizza", "Cheese", "Tomato");
        }
        return pizza;
    }
}
