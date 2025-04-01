package CharacterAnalysis;

import java.util.HashSet;
import java.util.Set;

class FirstRepeatingCharacter {

    public static void main(String[] args) {
        String testString = "abcdeffghija";
        Character result = findFirstRepeatingCharacter(testString);
        System.out.println(result);
    }

    public static Character findFirstRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return null;
    }
}
