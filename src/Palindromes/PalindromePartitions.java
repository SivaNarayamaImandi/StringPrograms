package Palindromes;

public class PalindromePartitions {
    public static void main(String[] args) {
        String str = "BaaB";
        System.out.println("All palindromic partitions of " + str + " are:");
        findPalindromicPartitions(str, 0, "");
    }

    private static void findPalindromicPartitions(String str, int i, String s) {
        if (i == str.length()) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < str.length(); j++) {
            String substring = str.substring(i, j + 1);
            if (isPalindrome(substring)) {
                findPalindromicPartitions(str, j + 1, s + substring + " ");
            }
        }
    }

    private static boolean isPalindrome(String substring) {
        return substring.equals(new StringBuffer(substring).reverse().toString()) ? true : false;
    }
}
