public class ConstantTimeComparison {

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            result |= a.charAt(i) ^ b.charAt(i);
        }
        return result == 0;
    }

    public static void main(String[] args) {
        System.out.println(compare("secret", "secret"));
    }
}
