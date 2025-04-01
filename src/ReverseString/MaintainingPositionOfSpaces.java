package ReverseString;

public class MaintainingPositionOfSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = new StringBuilder(str.replace(" ", "")).reverse().toString();
        StringBuilder result = new StringBuilder();
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append(' ');
            } else {
                result.append(reversedStr.charAt(j));
                j++;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String with spaces maintained: " + result.toString());
    }
}
