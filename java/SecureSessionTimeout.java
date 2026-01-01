//Concept: Explicit session TTL
public class SecureSessionTimeout {

    static long createdAt = System.currentTimeMillis();
    static long TTL = 5000;

    static boolean isValid() {
        return System.currentTimeMillis() - createdAt < TTL;
    }

    public static void main(String[] args) throws Exception {
        Thread.sleep(3000);
        System.out.println("Session valid: " + isValid());
    }
}
