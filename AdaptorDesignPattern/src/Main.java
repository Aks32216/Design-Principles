//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*

You’re developing a new e-commerce platform.
Your system expects a simple interface for payment processing, something like this:

interface PaymentProcessor {
    void pay(double amount);
}

The Issue

Your company has been using an old third-party library for payments in another system, which exposes this class:

class LegacyPaymentGateway {
    public void makePayment(String currency, int amountInCents) {
        // Complex legacy logic
        System.out.println("Payment processed: " + amountInCents + " cents in " + currency);
    }
}

 */


public class Main {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacyPaymentProcessor = new LegacyPaymentProcessor();
        LegacyPaymentAdaptor legacyPaymentAdaptor = new LegacyPaymentAdaptor(legacyPaymentProcessor);

        legacyPaymentAdaptor.pay(55.9);
    }
}