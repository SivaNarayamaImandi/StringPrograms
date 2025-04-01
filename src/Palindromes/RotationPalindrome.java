package Palindromes;

public class RotationPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        if (isRotationPalindrome(str)) {
            System.out.println(str + " is a rotation of a palindrome.");
        } else {
            System.out.println(str + " is not a rotation of a palindrome.");
        }
    }

    private static boolean isRotationPalindrome(String str) {
        if (isPalindrome(str)) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            String rotatedStr = str.substring(i) + str.substring(0, i);
            if (isPalindrome(rotatedStr)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuffer(str).reverse().toString()) ? true : false;
    }
}
