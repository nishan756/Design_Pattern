package Factory_Method.Notification;

public class SMSNotification implements Notification {

    @Override 
    public void send(String message , String sender , String receiver){
        System.out.println("SMS Notification from "+sender+" to "+receiver+" : "+message);
    }
    
}
