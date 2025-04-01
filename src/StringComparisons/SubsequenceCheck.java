package StringComparisons;

class SubsequenceCheck {

    public static void main(String[] args) {
        String str = "abcde";
        String sub = "ace";
        boolean result = isSubsequence(str, sub);
        System.out.println(result);
    }

    public static boolean isSubsequence(String str, String sub) {
        if (sub == null || sub.isEmpty()) {
            return true;
        }
        if (str == null || str.isEmpty()) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < str.length() && j < sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == sub.length();
    }
}
