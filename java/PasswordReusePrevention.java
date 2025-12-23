import java.util.HashSet;
import java.util.Set;

public class PasswordReusePrevention {

    static Set<String> oldHashes = new HashSet<>();

    static boolean isReused(String newHash) {
        return oldHashes.contains(newHash);
    }

    public static void main(String[] args) {
        oldHashes.add("hash1");
        System.out.println(isReused("hash1"));
    }
}
