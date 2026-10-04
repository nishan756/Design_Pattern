package Factory_Method.Payment;

public class Main {
    
    public static void main(String[] args) {

        // Nagad Payment
        
        PaymentFactory factory = new NagadPaymentFactory();

        Payment payment = factory.createPayment();

        payment.pay(256500, "000000", "000000");

        // Bkash Payment

        factory = new BkashPaymentFactory();

        payment = factory.createPayment();

        payment.pay(256500, "000000", "000000");

        // Card Payment

        factory = new CardPaymentFactory();

        payment = factory.createPayment();

        payment.pay(256500, "000000", "000000");

        // Bank Payment

        factory = new BankPaymentFactory();

        payment = factory.createPayment();

        payment.pay(256500, "000000", "000000");

    }
}
