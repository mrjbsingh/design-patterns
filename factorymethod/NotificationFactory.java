package factorymethod;

import factorymethod.notification.EmailNotification;
import factorymethod.notification.Notification;
import factorymethod.notification.PushNotification;
import factorymethod.notification.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(String channel){
        try{
            switch (channel.toUpperCase()){
                case "SMS": return new SMSNotification();
                case "EMAIL": return new EmailNotification();
                case "PUSH" : return new PushNotification();
                default:
                    throw new IllegalArgumentException();
            }
        }catch (Exception ex){
            System.out.println("Unknown Channel "+ channel);
        }
        return null;
    }
}
