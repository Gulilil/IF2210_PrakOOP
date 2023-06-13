import java.util.ArrayList;
import java.util.List;

public class BoxOperator {
    public static <T> List<T> getContents(Box<?> box, Class<T> type) {
        // Implement this function.
        // Case need to be handled: Box may contains null value, please make sure it is not returned.
        List<T> res = new ArrayList<T>();
        for (int i = 0; i < box.getContents().size() ; i++){
            if (box.getContents().get(i) != null && type.isAssignableFrom(box.getContents().get(i).getClass())){
                res.add(type.cast(box.getContents().get(i)));
            }
        }
        // for(Object temp : box.getContents()){
        //     if (type.isAssignableFrom(temp.getClass()) && temp != null) {
        //         res.add(type.cast(temp));
        //     }
        // }

        return res;
    }
}