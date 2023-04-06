import java.util.*;

public class GameKata {
    public static void run(String[] tito, String[] wiwid) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : tito) {
            if (!map.containsKey(string)){
                map.put(string, 1);
            }
        }
        for (String string : wiwid) {
            if (map.containsKey(string)){
                map.put(string, 2);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2){
                System.out.println(entry.getKey());
            }
        }
    }
  }