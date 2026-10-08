package Adapter.Payment;

public class Main {
    

    public static void main(String[] args){

        PaymentClient client = new PaymentClient(new StripeAdapter(new StripeGateway()));

        client.makePayment(120.5, "0123456", "1234567");

        client = new PaymentClient(new BkashAdapter(new BkashGateway()));

        client.makePayment(450, "23456", "78910");
    }


}
