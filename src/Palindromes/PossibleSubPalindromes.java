package Palindromes;

public class PossibleSubPalindromes {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println("All possible palindromic substrings of " + str + " are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > 1) {
                    System.out.println(substring);
                }
            }
        }
    }

    private static boolean isPalindrome(String substring) {
        return substring.equals(new StringBuffer(substring).reverse().toString()) ? true : false;
    }
}
