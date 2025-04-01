package Validations;

class DigitsOnly {

    public static void main(String[] args) {
        String str1 = "12345";
        boolean result1 = isDigitsOnly(str1);
        System.out.println(result1);
    }

    public static boolean isDigitsOnly(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
