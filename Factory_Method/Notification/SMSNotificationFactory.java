package Factory_Method.Notification;

public class SMSNotificationFactory implements NotificationFactory {

    @Override 
    public Notification createNotification(){
        return new SMSNotification();
    }
    
}
