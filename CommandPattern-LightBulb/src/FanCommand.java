public class FanCommand implements Command{
    private final Fan fan;

    FanCommand(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
        this.fan.on();
    }

    @Override
    public void unexecute() {
        this.fan.off();
    }
}
