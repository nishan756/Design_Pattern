package Factory.Notification;

import java.util.*;


public class EmailNotification implements Notification {

    @Override 
    public void send(String message, List<String> recipients){
        for(String recipient : recipients){
            System.out.println("Sending email to " + recipient + " with message: " + message);
        }
    }
    
}
