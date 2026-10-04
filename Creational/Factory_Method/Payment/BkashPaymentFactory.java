package Factory_Method.Payment;

public class BkashPaymentFactory implements PaymentFactory {

    @Override 
    public Payment createPayment() {
        return new BkashPayment();
    }
    
}
