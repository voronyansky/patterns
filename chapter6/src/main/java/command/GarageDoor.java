package command;

/**
 * Model of garage door.
 * @author evrnsky
 * @since 24.07.2016
 */
public class GarageDoor {

    private Command command;

    public GarageDoor(Command command) {
        this.command = command;
    }
    public void up() {
        System.out.println("Garage door is up");
    }

    public void down() {
        System.out.println("Garage door is down");
    }

    public void lightOn() {
        command.execute();
    }

    public void lightOff() {
        System.out.println("Light turn off");
    }

}
