package command;

/**
 * Model of remote controller.
 * @author evrnsky
 * @since 24.07.2016
 */
public class SimpleRemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;
    private int position = 0;

    public SimpleRemoteControl() {
        onCommand = new Command[8];
        offCommand = new Command[8];
    }

    public void addCommand(Command onCommand, Command offCommand) {
        this.onCommand[position] = onCommand;
        this.offCommand[position] = offCommand;
        this.position++;
    }

    public void buttonOnWasPressed(int position) {
        if(position >= 0 && position <= onCommand.length - 1) {
            onCommand[position].execute();
        }
        undoCommand = this.offCommand[position];
    }

    public void buttonOffWarPressed(int position) {
        if (position >= 0 && position <= offCommand.length - 1) {
            offCommand[position].execute();
        }
        undoCommand = this.onCommand[position];
    }

    public void buttonUndoWasPressed() {
        undoCommand.execute();
    }


}
