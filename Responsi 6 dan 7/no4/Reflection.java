import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reflection{
    //TIDAK BOLEH MENGUBAH NAMA METHOD YANG SUDAH ADA DAN PARAMS SERTA INPUT TYPENYA
    //BOLEH MENAMBAHKAN PRIVATE / PROTECTED METHOD SESUAI DENGAN KEBUTUHAN
    //DI LUAR SANA ADA KELAS YANG NAMANYA Ghost DAN Secret.

    public ArrayList<String> ghostMethods() throws Exception{
        Class <?> Ghost = Class.forName("Ghost");
        ArrayList<String> temp = new ArrayList<>();
        for (Method method: Ghost.getDeclaredMethods()){
            method.setAccessible(true);
            temp.add(method.getName());
        }
        return temp;
    }   

    public Integer sumGhost() throws Exception{
        Class <?> Ghost = Class.forName("Ghost");
        Object g = Ghost.newInstance();
        Integer res = 0;
        for (Method method: Ghost.getDeclaredMethods()){
            method.setAccessible(true);
            if (method.getReturnType().equals(Integer.class)){
                res += (Integer) method.invoke(g);
            }
        }
        return res;
    }

    public String letterGhost() throws Exception{
        Class<?> Ghost = Class.forName("Ghost");
        Object g = Ghost.newInstance();
        String res = new String();
        for (Method method : Ghost.getDeclaredMethods()){
            method.setAccessible(true);
            if (method.getReturnType().equals(String.class)){
                res += (String) method.invoke(g);
            }
        }
        return res;
    }

    public String findSecretId(List<Secret> sl, String email) throws Exception{
        for (Secret s : sl){
            if (s.isThis(email)){
                Field id = s.getClass().getDeclaredField("uniqueId");
                id.setAccessible(true);
                String res = (String) id.get(s);
                return res;
            }
        }
        return "NaN";
    }
}

