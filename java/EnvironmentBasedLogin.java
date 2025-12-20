public class EnvironmentBasedLogin {
    public static boolean login(String user, String pass) {
        String envUser = System.getenv("APP_USER");
        String envPass = System.getenv("APP_PASS");

        return user.equals(envUser) && pass.equals(envPass);
    }
}
