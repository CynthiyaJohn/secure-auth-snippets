public class TimingAttackExample {
    public static boolean insecureCompare(String a, String b) {
        return a.equals(b); // vulnerable
    }
}
