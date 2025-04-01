package Validations;

import java.util.regex.Pattern;

class ValidEmail {

    public static void main(String[] args) {
        String email1 = "test@example.com";
        boolean result1 = isValidEmail(email1);
        System.out.println(result1);

        String email2 = "invalid-email";
        boolean result2 = isValidEmail(email2);
        System.out.println(result2);
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}
