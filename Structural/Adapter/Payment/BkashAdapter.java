package Adapter.Payment;

public class BkashAdapter implements Payment {

    private final BkashGateway gateway;

    public BkashAdapter(BkashGateway gateway){
        this.gateway = gateway;
    }
    
    @Override 
    public String pay(double amount , String sender , String receiver){
        String result = gateway.startPayment((int) amount, sender, receiver);
        return result;
    }
}