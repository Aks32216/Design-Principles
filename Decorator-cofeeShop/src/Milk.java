public class Milk extends Decorator{
    private int count = 0;

    public Milk(Coffee coffee) {
        super(coffee);
        count++;
    }

    @Override
    public String getDescription() {
        if(count > 1){
            return  coffee.getDescription() + " with "+ count +"x milk";
        }
        return coffee.getDescription() + " with milk";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 10;
    }
}
