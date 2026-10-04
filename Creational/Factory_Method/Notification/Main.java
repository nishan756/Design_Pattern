package Factory_Method.Notification;

public class Main {
    public static void main(String[] args) {
        
        // SMS Notification

        NotificationFactory factory = new SMSNotificationFactory();

        Notification notification = factory.createNotification();

        notification.send("Hellow, This is Nihsna", "Nishan", "Razoan");

        // Push Notification
        factory = new PushNotificationFactory();

        notification = factory.createNotification();

        notification.send("Hellow, This is Nihsna", "Facebook", "Razoan");

        // Email Notification
        factory = new EmailNotificationFactory();

        notification = factory.createNotification();

        notification.send("Hellow, This is Nihsna", "aanishan339@gmail.com", "razoanabir09@gmail.com");
    }
}
