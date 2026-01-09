public class BrokenRoleValidation {

    static void accessAdmin(boolean loggedIn) {
        if (loggedIn) {
            System.out.println("Admin access granted");
        }
    }

    public static void main(String[] args) {
        accessAdmin(true);
    }
}
