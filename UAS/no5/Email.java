public class Email implements Observer{
    public void update(String notif){
        System.out.println("Got an Email notification: "+notif);
    }
}
