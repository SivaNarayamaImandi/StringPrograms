package CharacterAnalysis;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String testString = "Hello, World!";
        countVowelsAndConsonants(testString);
    }

    public static void countVowelsAndConsonants(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Vowels: 0, Consonants: 0");
            return;
        }

        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}
