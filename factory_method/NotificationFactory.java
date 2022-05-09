package factory_method;

import factory_method.notification.EmailNotification;
import factory_method.notification.Notification;
import factory_method.notification.PushNotification;
import factory_method.notification.SMSNotification;

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
