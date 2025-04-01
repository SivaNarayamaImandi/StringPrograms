package Palindromes;

public class LongestPalinddrome {
    public static void main(String[] args) {
        String str = "madam racecar level longest";
        String[] words = str.split(" ");
        String longestPalindrome = "";
        for (String word : words) {
            if (isPalindrome(word) && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }
        if (!longestPalindrome.isEmpty()&& longestPalindrome.length() > 1)
            System.out.println("Longest palindromic substring is: " + longestPalindrome);
        else
            System.out.println("No palindromic substring found.");
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuffer(str).reverse().toString())?true:false;
    }
}
