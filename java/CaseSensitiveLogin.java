public class CaseSensitiveLogin {

    public static boolean login(String username) {
        return username.equals("admin"); // case-sensitive
    }

    public static void main(String[] args) {
        System.out.println(login("Admin"));
    }
}
