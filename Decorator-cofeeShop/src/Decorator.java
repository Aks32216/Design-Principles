abstract public class Decorator implements Coffee{
    protected Coffee coffee;

    public Decorator(Coffee coffee){
        this.coffee=coffee;
    }
}
