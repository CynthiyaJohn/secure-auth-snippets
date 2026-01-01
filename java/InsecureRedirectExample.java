//Concept: Open redirect vulnerability
public class InsecureRedirectExample {

    static void redirect(String url) {
        System.out.println("Redirecting to " + url);
    }

    public static void main(String[] args) {
        redirect("http://evil.com");
    }
}
