import java.util.*;

public class Test {

    public static void main (String[] args){
        List<Object> list = new ArrayList<Object>();
        Double d = 56.8;
        String s = "test";
        Integer i = 78;
        Character c = 'c';
        list.add(d);
        list.add(s);
        list.add(i);
        list.add(c);
        list.add("hehe");
        list.add("plis bisa");
        list.add(null);

        for (Object o : list){
            System.out.println(o);
        }

        BoxOperator bo = new BoxOperator();
        Box<Object> b = new Box<Object>(list);
        List<Object> ints = bo.getContents(b, Object.class);

        for (Object in : ints){
            System.out.println(in);
        }
    }


}
