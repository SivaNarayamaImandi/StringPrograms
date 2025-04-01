package Palindromes;

public class CountPalindromes {
    public static void main(String[] args) {
        String str = "madam racecar level longest";
        String[] srtArray = str.split(" ");
        int count = 0;
        for (String string : srtArray) {
            if (isPalindrome(string)) {
                count++;
            }
        }
        System.out.println("No of palindromes present in a string is " + count);
    }

    private static boolean isPalindrome(String string) {
        return string.equals(new StringBuffer(string).reverse().toString()) ? true : false;
    }
}
