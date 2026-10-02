package Factory_Method.Notification;

public class EmailNotification implements Notification {
    
    @Override 
    public void send(String message , String sender , String receiver){
        System.out.println("Email Notification from "+sender+" to "+receiver+" : "+message);
    }
}
