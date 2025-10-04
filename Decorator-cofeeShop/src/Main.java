//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Latte();

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
        coffee= new Mocha(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
        coffee = new Discount(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}