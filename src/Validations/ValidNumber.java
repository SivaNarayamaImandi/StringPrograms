package Validations;

class ValidNumber {

    public static void main(String[] args) {
        String str = "12.3";
        boolean result = isValidNumber(str);
        System.out.println(result);
    }

    public static boolean isValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.trim();
        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasE = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == '.') {
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                hasDigit = false;
            } else if (c == '-' || c == '+') {
                if (i != 0 && str.charAt(i - 1) != 'e' && str.charAt(i - 1) != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return hasDigit;
    }
}
