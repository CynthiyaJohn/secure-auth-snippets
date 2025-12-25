import java.security.SecureRandom;

public class SecureNonceExample {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        System.out.println(random.nextLong());
    }
}
