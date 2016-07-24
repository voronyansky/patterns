package command;

/**
 * Created by Andrey on 24.07.2016.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl controller = new SimpleRemoteControl();
        Light sun = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(sun);
        LightOnCommand lightOnCommand = new LightOnCommand(sun);

        controller.addCommand(lightOnCommand, lightOffCommand);
        controller.buttonOnWasPressed(0);
        controller.buttonOffWarPressed(0);
        controller.buttonUndoWasPressed();
    }
}
