package Adapter.Payment;

public class PaymentClient {
    
    private final Payment payment;

    public PaymentClient(Payment payment){
        this.payment = payment;
    }

    public void makePayment(double amount , String sender , String receiver){

        String result = payment.pay(amount, sender , receiver);

        System.out.println("Result: "+result);
    }
}