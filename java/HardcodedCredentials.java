public class HardcodedCredentials {
    public static boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("admin123");
    }
}
