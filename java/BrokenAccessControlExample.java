//Concept: Missing authorization check

public class BrokenAccessControlExample {

    static void viewAdminPage(String role) {
        // ❌ no role check
        System.out.println("Admin page accessed");
    }

    public static void main(String[] args) {
        viewAdminPage("user");
    }
}
