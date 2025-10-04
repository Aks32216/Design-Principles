public class Latte implements Coffee{

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
