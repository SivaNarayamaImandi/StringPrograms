package CharacterAnalysis;

import java.util.HashMap;
import java.util.Map;

class RemoveRepeatingCharacters {

    public static void main(String[] args) {
        String testString = "aabbccddeeffz";
        String result = removeRepeating(testString);
        System.out.println(result);
    }

    public static String removeRepeating(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
