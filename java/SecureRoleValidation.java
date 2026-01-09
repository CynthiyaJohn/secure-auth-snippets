public class SecureRoleValidation {

    static void accessAdmin(String role) {
        if (!"admin".equals(role)) {
            System.out.println("Access denied");
            return;
        }
        System.out.println("Admin access granted");
    }

    public static void main(String[] args) {
        accessAdmin("user");
    }
}
