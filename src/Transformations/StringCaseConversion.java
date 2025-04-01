package Transformations;

class StringCaseConversion {

    public static void main(String[] args) {
        String str = "Hello World";
        String lower = myToLowerCase(str);
        String upper = myToUpperCase(str);
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
    }

    public static String myToLowerCase(String str) {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }

    public static String myToUpperCase(String str) {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }
}
