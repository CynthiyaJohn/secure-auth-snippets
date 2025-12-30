//Concept: Early-return password comparison (timing risk)

public class InsecurePasswordComparison {

    static boolean check(String a, String b) {
        return a.equals(b); // ❌ timing leak
    }

    public static void main(String[] args) {
        System.out.println(check("secret", "secret"));
    }
}
