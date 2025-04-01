package StringComparisons;

import java.util.HashMap;
import java.util.Map;

class KAnagrams {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        boolean result = areKAnagrams(str1, str2, k);
        System.out.println(result);
    }

    public static boolean areKAnagrams(String str1, String str2, int k) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

        int diffCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount2.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (charCount1.containsKey(c)) {
                diffCount += Math.abs(count - charCount1.get(c));
                charCount1.remove(c);
            } else {
                diffCount += count;
            }
        }
        for (int count : charCount1.values()){
            diffCount+=count;
        }

        return diffCount / 2 <= k;
    }
}
