public class InsecureSessionToken {

    public static String generateToken(int userId) {
        return "token-" + userId; // predictable
    }

    public static void main(String[] args) {
        System.out.println(generateToken(101));
    }
}
