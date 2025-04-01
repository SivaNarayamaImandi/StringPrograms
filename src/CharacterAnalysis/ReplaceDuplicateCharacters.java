package CharacterAnalysis;

import java.util.HashSet;
import java.util.Set;

class ReplaceDuplicateCharacters {

    public static void main(String[] args) {
        String testString = "aabbccddeeff";
        String result = replaceDuplicates(testString);
        System.out.println(result);
    }

    public static String replaceDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                sb.append('*');
            } else {
                sb.append(c);
                seen.add(c);
            }
        }

        return sb.toString();
    }
}
