package Factory_Method.Payment;

public class NagadPayment implements Payment {

    @Override
    public void pay(double amount, String sender, String receiver) {
        System.out.println("Payment of " + amount + " from " + sender + " to " + receiver + " via Nagad.");
    }
}
