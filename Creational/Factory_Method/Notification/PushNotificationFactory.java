package Factory_Method.Notification;


public class PushNotificationFactory implements NotificationFactory{
    @Override 
    public Notification createNotification(){
        return new PushNotification();
    }
}