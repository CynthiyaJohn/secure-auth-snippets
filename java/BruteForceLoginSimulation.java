public class BruteForceLoginSimulation {

    public static void main(String[] args) {
        String correctPassword = "secret";
        String[] attempts = {"1234", "admin", "password", "secret"};

        for (String attempt : attempts) {
            if (attempt.equals(correctPassword)) {
                System.out.println("Password cracked: " + attempt);
                break;
            }
        }
    }
}
