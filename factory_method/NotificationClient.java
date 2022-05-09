package factory_method;

import factory_method.notification.Notification;

import java.util.Scanner;

public class NotificationClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String channel;
        do{
            channel = sc.nextLine();
            try{
                NotificationFactory notificationFactory = new NotificationFactory();
                Notification notification = notificationFactory.createNotification(channel);
                notification.notifyUser();
            }catch (Exception e){
                System.out.println("No object created from factory as channel is "+ channel);
                e.printStackTrace();
            }
        }while (!channel.equalsIgnoreCase("Exit"));

    }
}
