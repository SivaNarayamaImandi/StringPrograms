package CharacterAnalysis;

import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String testString = "aabbccddeeff";
        String result = removeDuplicates(testString);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
