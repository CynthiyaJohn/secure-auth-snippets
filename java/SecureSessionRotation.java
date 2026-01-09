import java.security.SecureRandom;
import java.util.Base64;

public class SecureSessionRotation {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        String newSession =
                Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        System.out.println("New session: " + newSession);
    }
}
