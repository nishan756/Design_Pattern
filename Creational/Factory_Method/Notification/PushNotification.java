package Factory_Method.Notification;

public class PushNotification implements Notification{

    @Override 
    public void send(String message , String sender , String receiver){
        System.out.println("Push Notification from "+sender+" to "+receiver+" : "+message);
    }
    
}
