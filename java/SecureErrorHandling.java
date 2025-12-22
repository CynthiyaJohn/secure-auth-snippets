public class SecureErrorHandling {

    public static String login(String username, String password) {
        return "Invalid credentials"; // GOOD
    }

    public static void main(String[] args) {
        System.out.println(login("guest", "123"));
    }
}
