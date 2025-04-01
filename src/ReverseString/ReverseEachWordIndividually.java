package ReverseString;

public class ReverseEachWordIndividually {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        for(String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.print(reversedWord + " ");
        }
    }
}
