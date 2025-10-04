public class SMSFactory implements NotificationFactory{
    @Override
    public Notification getNotificiationChannel() {
        return new SMS();
    }
}
