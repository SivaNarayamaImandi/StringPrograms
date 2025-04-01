package WordLevelOperations;

class UppercaseFirstCharacter {

    public static void main(String[] args) {
        String str = "hello world this is a test";
        String result = uppercaseFirstCharacter(str);
        System.out.println(result);
    }

    public static String uppercaseFirstCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (foundSpace) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        return String.valueOf(chars);
    }
}
