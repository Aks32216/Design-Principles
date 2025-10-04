//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new EmailNotificationFactory();
        Notification notification=notificationFactory.getNotificiationChannel();
        notification.sendNotification("Hello How are you");

        notificationFactory=new SMSFactory();
        notification=notificationFactory.getNotificiationChannel();
        notification.sendNotification("Hello How are you");

        notificationFactory=new PushNotificationFactory();
        notification=notificationFactory.getNotificiationChannel();
        notification.sendNotification("Hello How are you");
    }
}
