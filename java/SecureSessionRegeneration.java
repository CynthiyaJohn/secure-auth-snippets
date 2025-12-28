//Concept: Regenerating session after login
import java.security.SecureRandom;
import java.util.Base64;

public class SecureSessionRegeneration {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        String newSessionId =
                Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);

        System.out.println("New Session ID: " + newSessionId);
    }
}
