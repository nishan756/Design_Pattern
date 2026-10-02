package Factory_Method.Payment;

public class CardPaymentFactory implements PaymentFactory {
    
    @Override 
    public Payment createPayment(){
        return new CardPayment();
    }

}
