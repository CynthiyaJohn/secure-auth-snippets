//Concept: No session expiration
public class SessionTimeoutExample {

    static long sessionStart = System.currentTimeMillis();

    static boolean isSessionValid() {
        return (System.currentTimeMillis() - sessionStart) < 3000;
    }

    public static void main(String[] args) throws Exception {
        Thread.sleep(4000);
        System.out.println("Session valid: " + isSessionValid());
    }
}
