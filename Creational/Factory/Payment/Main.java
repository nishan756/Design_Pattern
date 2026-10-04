package Factory.Payment;

public class Main {
    
    public static void main(String[] args) {
        
        PaymentFactory payment = new PaymentFactory();

        Payment paymentMethod = payment.createPayment("nagad");

        paymentMethod.pay(25000, "01234567898", "01234567898");

        paymentMethod = payment.createPayment("bkash");

        paymentMethod.pay(25000, "01234567898", "01234567898");

        paymentMethod = payment.createPayment("bank");

        paymentMethod.pay(25000, "000000000", "111111111");

        paymentMethod = payment.createPayment("card");

        paymentMethod.pay(25000, "000000000", "111111111");
    }
}
