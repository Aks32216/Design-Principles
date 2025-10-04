//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport ship = transportFactory.getTransport("Ship");
        ship.transport();
        Transport truck = transportFactory.getTransport("Truck");
        truck.transport();
    }
}