import java.util.Random;

public class InsecureOTPGeneration {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(999999));
    }
}
