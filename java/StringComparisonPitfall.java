public class StringComparisonPitfall {
    public static void main(String[] args) {
        String a = new String("admin");
        String b = new String("admin");

        System.out.println(a == b);        // false (WRONG)
        System.out.println(a.equals(b));   // true (CORRECT)
    }
}
