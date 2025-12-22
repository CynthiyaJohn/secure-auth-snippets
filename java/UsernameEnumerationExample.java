import java.util.HashMap;
import java.util.Map;

public class UsernameEnumerationExample {

    static Map<String, String> users = new HashMap<>();

    static {
        users.put("admin", "hash");
    }

    public static String login(String username) {
        if (!users.containsKey(username)) {
            return "User not found"; // BAD
        }
        return "Wrong password";
    }

    public static void main(String[] args) {
        System.out.println(login("guest"));
    }
}
