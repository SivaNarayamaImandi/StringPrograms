package Palindromes;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
//        StringBuffer sb = new StringBuffer(str);
//        if (str.equals(new StringBuffer(str).reverse().toString())) {
//            System.out.println(str + " is a palindrome.");
//        } else {
//            System.out.println(str + " is not a palindrome.");
//        }

        // other way to check palindrome
        String result = str.equals(new StringBuffer(str).reverse().toString())?str + " is a palindrome.":str + " is not a palindrome.";
        System.out.println(result);
    }
}
