package Factory.Notification;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        NotificationFactory notification = new NotificationFactory();

        Notification email = notification.createNotification("email");

        List<String> emailrecipients = new ArrayList<>();

        emailrecipients.add("aanishan339@gmail.com");

        emailrecipients.add("aanishan756@gmail.com");


        email.send("Hellow from Nishan", emailrecipients);

        Notification SMS = notification.createNotification("sms");

        List<String> smsrecipients = new ArrayList<>();

        smsrecipients.add("00000000000");

        smsrecipients.add("11111111111");

        SMS.send("Hellow from Nishan", smsrecipients);

        Notification push = notification.createNotification("push");

        List<String> pushrecipients = new ArrayList<>();

        pushrecipients.add("Samsung Z Fold");

        pushrecipients.add("I Phone 18 Pro Max");

        push.send("Hellow from Nishan", pushrecipients);

    }
}
