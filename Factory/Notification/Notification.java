package Factory.Notification;

import java.util.List;

public interface Notification {

    void send(String message , List<String> recipients);
}