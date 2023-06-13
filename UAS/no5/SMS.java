

public class SMS implements Observer{
    public void update(String notif){
        System.out.println("Got an SMS notification: "+notif);
    }
}
