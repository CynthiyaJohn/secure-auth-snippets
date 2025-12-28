//Concept: Missing authorization check
public class PrivilegeEscalationExample {

    static void deleteUser(String role) {
        if (!role.equals("admin")) {
            System.out.println("Access denied");
            return;
        }
        System.out.println("User deleted");
    }

    public static void main(String[] args) {
        deleteUser("user"); // should fail
    }
}
