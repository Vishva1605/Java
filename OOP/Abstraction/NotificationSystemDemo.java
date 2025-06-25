interface Notifier{
    String notifyUser();
}
class EmailNotifier implements Notifier{
    public String notifyUser(){return "Sending Email Notification...";}
}
class SMSNotifier implements Notifier{
    public String notifyUser(){return "Sending SMS Notification...";}
}
public class NotificationSystemDemo {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier();
        Notifier n2 = new SMSNotifier();
        System.out.println(n1.notifyUser());
        System.out.println(n2.notifyUser());
    }
}
