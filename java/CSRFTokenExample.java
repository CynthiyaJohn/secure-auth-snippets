import java.security.SecureRandom;
import java.util.Base64;

public class CSRFTokenExample {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte[] token = new byte[16];
        random.nextBytes(token);
        System.out.println(Base64.getEncoder().encodeToString(token));
    }
}
