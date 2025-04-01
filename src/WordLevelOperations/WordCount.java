package WordLevelOperations;

class WordCount {

    public static void main(String[] args) {
        String str = "hello world this is a test string";
        int count = countWords(str);
        System.out.println(count);
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
