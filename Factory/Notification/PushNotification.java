package Factory.Notification;

import java.util.List;

public class PushNotification implements Notification{

    @Override
    public void send(String message, List<String> recipients){
        for(String recipient : recipients){
            System.out.println("Sending push notification to " + recipient + ": " + message);
        }
    }
    
}
