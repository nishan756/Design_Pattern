package Factory_Method.Payment;

public class BankPaymentFactory implements PaymentFactory{

    @Override 
    public Payment createPayment(){
        return new BankPayment();
    }
}
