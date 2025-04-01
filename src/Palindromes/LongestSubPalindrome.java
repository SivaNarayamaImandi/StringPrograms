package Palindromes;

public class LongestSubPalindrome {
    public static void main(String[] args) {
        String str = "banana";
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        if (!longestPalindrome.isEmpty()&& longestPalindrome.length() > 1)
            System.out.println("Longest palindromic substring is: " + longestPalindrome);
        else
            System.out.println("No palindromic substring found.");
    }

    private static boolean isPalindrome(String substring) {
        return substring.equals(new StringBuffer(substring).reverse().toString()) ? true : false;
    }
}
