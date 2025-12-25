import java.security.MessageDigest;

public class PasswordHashWithoutSalt {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest("password123".getBytes());
        System.out.println(new String(hash));
    }
}
