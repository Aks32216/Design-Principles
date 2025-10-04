public class Mocha extends Decorator{
    private int count = 0;
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        if(count > 1){
            return  coffee.getDescription() + " with "+ count + "x mocha";
        }
        return coffee.getDescription() + " with mocha";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 20;
    }
}
