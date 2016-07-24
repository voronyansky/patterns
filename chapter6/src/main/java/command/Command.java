package command;

/**
 * @author evrnsky
 * @since 24.07.2016
 */
public interface Command {

    void execute();
    void undo();
}
