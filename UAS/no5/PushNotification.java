public class PushNotification implements Observer{
    public void update(String notif){
        System.out.println("Got a PushNotification notification: "+notif);
    }
}
