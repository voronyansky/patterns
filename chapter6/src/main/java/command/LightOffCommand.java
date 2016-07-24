package command;

/**
 * Command for turn off light.
 * @author evrnsky
 * @since 24.07.2016
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }

}
