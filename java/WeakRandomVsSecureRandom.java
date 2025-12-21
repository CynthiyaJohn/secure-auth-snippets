import java.security.SecureRandom;
import java.util.Random;

public class WeakRandomVsSecureRandom {
    public static void main(String[] args) {
        Random weak = new Random();
        SecureRandom strong = new SecureRandom();

        System.out.println("Weak token: " + weak.nextInt(999999));
        System.out.println("Secure token: " + strong.nextInt(999999));
    }
}
