public class SessionFixationAttack {

    static void login(String sessionId) {
        System.out.println("Logged in with session: " + sessionId);
    }

    public static void main(String[] args) {
        login("fixed-session-123");
    }
}
