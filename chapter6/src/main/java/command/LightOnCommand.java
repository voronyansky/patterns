package command;

/**
 * Command for turn on light object
 * @author evrnsky
 * @since 24.07.2016
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        this.light.off();
    }
}
