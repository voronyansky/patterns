package command;

/**
 *  Command for opend garage door.
 *  @author evrnsky
 *  @since 24.07.2016
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        this.door.up();
    }

    public void undo() {
        this.door.down();
    }
}
