public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification getNotificiationChannel() {
        return new Email();
    }
}
