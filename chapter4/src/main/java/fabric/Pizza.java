package fabric;

/**
 * @author evrnsky
 * @since 25.06.2016
 */
public abstract class Pizza {

    private String name;
    private String dough;
    private String sauge;

    public Pizza(String name, String dough, String sauge) {
        this.name = name;
        this.dough = dough;
        this.sauge = sauge;
    }
    public void prepare() {
        System.out.println(String.format("Prepare: %s", this.name));
        System.out.println(String.format("Add dough: %s", this.dough));
        System.out.println(String.format("Add sauge: %s", this.sauge));
    }

    public void bake() {
        System.out.println(String.format("%s bake 25 minute at 350 degrees", this.name));
    }

    public void cut() {
        System.out.println("Cut pizza for you and your friend:)");
    }

    public void box() {
        System.out.println("Package a delicious pizza");
    }

    public String getName() {
        return this.name;
    }




}
