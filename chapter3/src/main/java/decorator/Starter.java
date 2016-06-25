package decorator;

/**
 * Test of decorator.
 */
public class Starter {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+ ". It cost is: " + espresso.cost());
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription()+". It cost is: " + espresso.cost());
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription()+". It cost is: " + espresso.cost());
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription()+". It cost is: " + espresso.cost());


    }
}
