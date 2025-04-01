package CharacterAnalysis;

class AdjacentDuplicates {

    public static void main(String[] args) {
        String testString = "aabbccddeeff";
        boolean result = hasAdjacentDuplicates(testString);
        System.out.println(result);
    }

    public static boolean hasAdjacentDuplicates(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
