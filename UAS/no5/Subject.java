import java.util.*;

public class Subject {
    private List<Observer> subscriberList = new ArrayList<>();
    private String lastNotif = "";

    public void addSubscriber(Observer o){
        subscriberList.add(o);
    }

    public void removeSubscriber(Observer o){
        subscriberList.remove(o);
    }

    public Observer getObserverByIdx(int idx){
        return subscriberList.get(idx);
    }

    public void notifyAllSubscribers(){
        for(Observer o : subscriberList){
            o.update(lastNotif);
        }
    }

    public void setNewNotif(String newNotif){
        lastNotif = newNotif;
        notifyAllSubscribers();
    }

}
