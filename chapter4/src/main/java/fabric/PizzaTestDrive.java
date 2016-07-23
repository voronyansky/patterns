package fabric;

/**
 * Created by Andrey on 23.07.2016.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        MoscowPizzaFabric moscowPizzaFabric = new MoscowPizzaFabric();
        Pizza moscow = moscowPizzaFabric.orderPizza("Moscow");

        System.out.println(moscow.getName());
    }
}
