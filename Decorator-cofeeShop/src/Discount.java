public class Discount extends Decorator{
    public Discount(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with 10% discount";
    }

    @Override
    public double getPrice() {
        double currentPrice = coffee.getPrice();
        double discountPrice = currentPrice * 0.1;
        return currentPrice-discountPrice;
    }
}
