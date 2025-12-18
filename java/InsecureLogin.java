public class InsecureLogin {

    public static boolean login(String password) {
        String storedPassword = "admin123"; // BAD PRACTICE
        return storedPassword.equals(password);
    }

    public static void main(String[] args) {
        System.out.println(login("admin123"));
    }
}


