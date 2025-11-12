public class RemoteControl {
    private Command lastCommand;

    public void setCommand(Command command) {
        this.lastCommand = command;
    }

    public void pressButton() {
        if (lastCommand != null) lastCommand.execute();
    }

    public void pressUndo() {
        if (lastCommand != null) lastCommand.unexecute();
    }
}
