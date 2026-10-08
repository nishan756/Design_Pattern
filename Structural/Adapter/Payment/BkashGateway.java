package Adapter.Payment;

public class BkashGateway {
    
    public String startPayment(int amount, String sender , String receiver){
        System.out.println("Payment successfull via : "+"Bkash");
        return "SUCCESS";
    }
}
