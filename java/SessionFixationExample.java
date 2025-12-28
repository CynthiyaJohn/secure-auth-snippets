//Concept: Session fixation vulnerability
public class SessionFixationExample {

    public static void main(String[] args) {
        String sessionId = "fixed-session-id"; // attacker-controlled
        System.out.println("Session ID: " + sessionId);
    }
}
