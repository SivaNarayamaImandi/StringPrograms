package CharacterAnalysis;

import java.util.HashMap;
import java.util.Map;

class SecondMostFrequentCharacter {

    public static void main(String[] args) {
        String testString = "aabbcdeeff";
        Character result = findSecondMostFrequentCharacter(testString);
        System.out.println(result);
    }

    public static Character findSecondMostFrequentCharacter(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        if (charFrequency.size() < 2) {
            return null;
        }

        Character mostFrequent = null;
        Character secondMostFrequent = null;
        int mostFrequency = 0;
        int secondMostFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char currentChar = entry.getKey();
            int currentFrequency = entry.getValue();

            if (currentFrequency > mostFrequency) {
                secondMostFrequent = mostFrequent;
                secondMostFrequency = mostFrequency;
                mostFrequent = currentChar;
                mostFrequency = currentFrequency;
            } else if (currentFrequency > secondMostFrequency && currentFrequency != mostFrequency) {
                secondMostFrequent = currentChar;
                secondMostFrequency = currentFrequency;
            }
        }

        return secondMostFrequent;
    }
}