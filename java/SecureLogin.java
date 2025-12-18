import java.security.MessageDigest;

public class SecureLogin {

    public static String hash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] bytes = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String password = "admin123";
        String hashed = hash(password);

        System.out.println("Hashed Password: " + hashed);
    }
}
