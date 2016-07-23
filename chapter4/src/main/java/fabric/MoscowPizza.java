package fabric;

/**
 * @author evrnsky
 * @since 23.07.2016
 */
public class MoscowPizza extends Pizza {

    public MoscowPizza(String name, String dough, String sauge) {
        super(name, dough, sauge);
    }

    @Override
    public void cut() {
        System.out.println("Cut with love");
    }
}
