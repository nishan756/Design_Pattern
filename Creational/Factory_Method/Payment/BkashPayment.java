package Factory_Method.Payment;

public class BkashPayment implements Payment {

    @Override
    public void pay(double amount, String sender, String receiver) {
        System.out.println("Payment of " + amount + " from " + sender + " to " + receiver + " via Bkash.");
    }
}
