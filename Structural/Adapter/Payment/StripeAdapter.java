package Adapter.Payment;

public class StripeAdapter implements Payment {

    private final StripeGateway gateway;

    public StripeAdapter(StripeGateway gateway){
        this.gateway = gateway;
    }
    
    @Override 
    public String pay(double amount, String sender , String receiver){

        String result = String.valueOf(gateway.performPayment((int) amount, sender, receiver));

        return result;

    }
}
