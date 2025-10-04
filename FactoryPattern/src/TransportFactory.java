public class TransportFactory {
    Transport getTransport(String input){
        return switch (input) {
            case "Truck" -> new Truck();
            case "Ship" -> new Ship();
            default -> null;
        };
    }
}
