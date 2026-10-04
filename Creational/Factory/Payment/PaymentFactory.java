package Factory.Payment;

public class PaymentFactory {
    
    public Payment createPayment(String type){
        if(type.equals("bkash")){
            return new BkashPayment();
        }

        else if(type.equals("nagad")){
            return new NagadPayment();
        }

        else if(type.equals("bank")){
            return new BankPayment();
        }

        else if(type.equals("card")){
            return new CardPayment();
        }

        throw new IllegalArgumentException();
    }
}
