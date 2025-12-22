public class AccountLockoutExample {

    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        int attempts = 0;
        String inputPassword = "wrong";

        while (attempts < MAX_ATTEMPTS) {
            if (inputPassword.equals("secret")) {
                System.out.println("Login success");
                return;
            }
            attempts++;
        }
        System.out.println("Account locked");
    }
}
