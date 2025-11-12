public class LegacyPaymentAdaptor implements PaymentProcessor{
    private final LegacyPaymentProcessor paymentProcessor;

    LegacyPaymentAdaptor(LegacyPaymentProcessor paymentProcessor){
        this.paymentProcessor=paymentProcessor;
    }


    @Override
    public void pay(double amount) {
        double toDollar = amount * 80;  // current currency conversion logic
        this.paymentProcessor.payMoney("USD",toDollar);
    }
}
