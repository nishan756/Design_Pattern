package Factory_Method.Payment;

public class NagadPaymentFactory implements PaymentFactory {

    @Override 
    public Payment createPayment(){
        return new NagadPayment();
    }
    
}
