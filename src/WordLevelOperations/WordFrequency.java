package WordLevelOperations;

import java.util.HashMap;
import java.util.Map;

class WordFrequency {

    public static void main(String[] args) {
        String str = "hello world hello this is a world";
        Map<String, Integer> frequency = findWordFrequency(str);
        System.out.println(frequency);
    }

    public static Map<String, Integer> findWordFrequency(String str) {
        if (str == null || str.trim().isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> frequency = new HashMap<>();
        String[] words = str.trim().toLowerCase().split("\\s+");

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        return frequency;
    }
}
