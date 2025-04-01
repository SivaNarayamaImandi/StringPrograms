package WordLevelOperations;

class LongestWordLength {

    public static void main(String[] args) {
        String str = "hello world this is a test";
        int length = findLongestWordLength(str);
        System.out.println(length);
    }

    public static int findLongestWordLength(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split(" ");
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }
}
