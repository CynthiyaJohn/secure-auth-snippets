import java.security.SecureRandom;

public class SecureOTPGeneration {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(900000) + 100000);
    }
}
