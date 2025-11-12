public class CurtainsCommand implements Command{
    private final Curtains curtains;

    CurtainsCommand(Curtains curtains){
        this.curtains=curtains;
    }

    @Override
    public void execute() {
        this.curtains.on();
    }

    @Override
    public void unexecute() {
        this.curtains.off();
    }
}
