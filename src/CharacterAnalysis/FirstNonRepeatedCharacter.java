package CharacterAnalysis;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String testString = "aabbcdeefcf";
        Character result = findFirstNonRepeatedCharacter(testString);
        System.out.println(result);
    }

    public static Character findFirstNonRepeatedCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}