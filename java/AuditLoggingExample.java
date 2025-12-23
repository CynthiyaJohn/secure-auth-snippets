public class AuditLoggingExample {

    static void log(String user, boolean success) {
        System.out.println("User=" + user + ", success=" + success);
    }

    public static void main(String[] args) {
        log("admin", false);
        log("admin", true);
    }
}
