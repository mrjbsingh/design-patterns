package factorymethod.notification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS Sent");
    }
}
