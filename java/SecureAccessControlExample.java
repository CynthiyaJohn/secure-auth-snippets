//Concept: Proper role validation

public class SecureAccessControlExample {

    static void viewAdminPage(String role) {
        if (!"admin".equals(role)) {
            System.out.println("Access denied");
            return;
        }
        System.out.println("Admin page accessed");
    }

    public static void main(String[] args) {
        viewAdminPage("user");
    }
}
