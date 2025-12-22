public class PasswordStrengthValidator {

    public static boolean isStrong(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        System.out.println(isStrong("Weak123"));
        System.out.println(isStrong("Strong@123"));
    }
}
