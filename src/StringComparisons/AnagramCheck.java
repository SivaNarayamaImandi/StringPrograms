package StringComparisons;

import java.util.Arrays;

class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = areAnagrams(str1, str2);
        System.out.println(result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
