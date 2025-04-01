package StringComparisons;

class ValidShuffle {

    public static void main(String[] args) {
        String str1 = "XY";
        String str2 = "12";
        String result = "X1Y2";
        boolean isValid = isValidShuffle(str1, str2, result);
        System.out.println(isValid);
    }

    public static boolean isValidShuffle(String str1, String str2, String result) {
        if (str1 == null || str2 == null || result == null || str1.length() + str2.length() != result.length()) {
            return false;
        }

        int i = 0, j = 0, k = 0;
        while (k < result.length()) {
            if (i < str1.length() && str1.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < str2.length() && str2.charAt(j) == result.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return i == str1.length() && j == str2.length();
    }
}
