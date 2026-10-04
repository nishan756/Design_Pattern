package Factory.Payment;

public class CardPayment implements  Payment{

    @Override 
    public void pay(double amount , String senderAccount, String receiverAccount){
        System.out.println("Paying " + amount + " to "+receiverAccount+" from "+senderAccount+" using card");
    }
}
