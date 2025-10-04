public class PushNotificationFactory implements NotificationFactory{
    @Override
    public Notification getNotificiationChannel() {
        return new PushNotification();
    }
}
