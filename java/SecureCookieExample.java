public class SecureCookieExample {
    public static void main(String[] args) {
        System.out.println(
            "Set-Cookie: sessionId=secure; Secure; HttpOnly; SameSite=Strict"
        );
    }
}
