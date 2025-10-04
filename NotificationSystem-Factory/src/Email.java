public class Email implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println(message+" send through Email");
    }
}
