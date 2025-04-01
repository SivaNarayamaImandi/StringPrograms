package StringComparisons;

class StringRotation {

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        boolean result = isRotation(str1, str2);
        System.out.println(result);
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        String combined = str1 + str1;
        return combined.contains(str2);
    }
}
