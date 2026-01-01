//Concept: Redirect allow-listing
import java.util.List;

public class SecureRedirectExample {

    static List<String> allowed = List.of("myapp.com", "example.com");

    static void redirect(String url) {
        for (String domain : allowed) {
            if (url.contains(domain)) {
                System.out.println("Redirecting to " + url);
                return;
            }
        }
        System.out.println("Invalid redirect");
    }

    public static void main(String[] args) {
        redirect("http://evil.com");
        redirect("https://myapp.com/home");
    }
}
//security focused

