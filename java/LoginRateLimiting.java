import java.util.HashMap;
import java.util.Map;

public class LoginRateLimiting {

    static Map<String, Integer> attempts = new HashMap<>();

    static boolean allowLogin(String user) {
        attempts.put(user, attempts.getOrDefault(user, 0) + 1);
        return attempts.get(user) <= 3;
    }

    public static void main(String[] args) {
        System.out.println(allowLogin("admin"));
        System.out.println(allowLogin("admin"));
        System.out.println(allowLogin("admin"));
        System.out.println(allowLogin("admin"));
    }
}
