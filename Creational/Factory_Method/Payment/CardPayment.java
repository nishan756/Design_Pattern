package Factory_Method.Payment;

public class CardPayment implements Payment {

    @Override 
    public void pay(double amount , String sender , String receiver){
        System.out.println("Paid "+amount+" to"+" from "+sender+" to"+receiver + " via Card");
    }
    
}
