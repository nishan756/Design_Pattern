package Adapter.Payment;

public class StripeGateway  {
    
    public int performPayment(int amount, String sender , String receiver){
        System.out.println("Payment completed via : "+"Stripe");
        return 1;
    }
}
