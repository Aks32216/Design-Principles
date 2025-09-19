class PayPalPaymentProcessor {
    void processPayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class PaymentService {
    private PayPalPaymentProcessor processor = new PayPalPaymentProcessor();

    void pay(double amount) {
        processor.processPayment(amount);
    }
}

// -------------------------------------------------------------------------------

interface PaymentProcessor{
    void processPayment(double amount);
}

class PayPalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing Payment of "+amount+" via PayPal");
    }
}

class PaymentService {
    private PaymentProcessor paymentProcessor;
    PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor=paymentProcessor;
    }

    void pay(double amount){
        paymentProcessor.processPayment(amount);
    }
}
