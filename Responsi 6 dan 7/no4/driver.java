import java.util.ArrayList;
import java.util.List;

public class driver {

    public static void main(String[] args) throws Exception {

        Reflection reflection = new Reflection();

        // Test ghostMethods method
        ArrayList<String> ghostMethods = reflection.ghostMethods();
        System.out.println("Ghost methods: " + ghostMethods);

        // Test sumGhost method
        Integer sumGhost = reflection.sumGhost();
        System.out.println("Sum of ghost numbers: " + sumGhost);

        // Test letterGhost method
        String letterGhost = reflection.letterGhost();
        System.out.println("Concatenated ghost letters: " + letterGhost);

        // Test findSecretId method
        List<Secret> secrets = new ArrayList<>();
        secrets.add(new Secret("john@example.com", "John"));
        secrets.add(new Secret("jane@example.com", "Jane"));
        String foundId = reflection.findSecretId(secrets, "jane@example.com");
        System.out.println("Found ID: " + foundId);

    }

}
