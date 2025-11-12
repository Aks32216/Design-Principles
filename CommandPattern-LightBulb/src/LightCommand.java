public class LightCommand implements Command{

    private final Light light;

    LightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unexecute() {
        this.light.off();
    }
}
