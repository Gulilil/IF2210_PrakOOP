public class Test {
    public static void main (String[] args){
        Subject s = new Subject();
        SMS sms = new SMS();
        PushNotification pn = new PushNotification();
        Email e = new Email();
        s.addSubscriber(sms);
        s.addSubscriber(pn);
        s.addSubscriber(e);

        s.setNewNotif("Notif pertama");
        s.removeSubscriber(s.getObserverByIdx(0));
        s.setNewNotif("SMS telah dihapus");
        s.removeSubscriber(s.getObserverByIdx(1));
        s.setNewNotif("Sisanya hanya tinggal Push Notification");
    }
}

// Output:
// Got an SMS notification: Notif pertama
// Got a PushNotification notification: Notif pertama
// Got an Email notification: Notif pertama
// Got a PushNotification notification: SMS telah dihapus
// Got an Email notification: SMS telah dihapus
// Got a PushNotification notification: Sisanya hanya tinggal Push Notification