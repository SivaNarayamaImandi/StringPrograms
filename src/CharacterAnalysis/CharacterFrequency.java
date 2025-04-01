package CharacterAnalysis;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String testString = "hello world";
        Map<Character, Integer> frequency = getCharacterFrequency(testString);
        System.out.println(frequency);
    }

    public static Map<Character, Integer> getCharacterFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
