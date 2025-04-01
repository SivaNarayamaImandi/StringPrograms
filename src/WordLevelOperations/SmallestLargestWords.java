package WordLevelOperations;

class SmallestLargestWords {

    public static void main(String[] args) {
        String str = "hello world this is a test string";
        String[] result = findSmallestLargestWords(str);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }

    public static String[] findSmallestLargestWords(String str) {
        if (str == null || str.isEmpty()) {
            return new String[]{"", ""};
        }

        String[] words = str.split(" ");
        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        return new String[]{smallest, largest};
    }
}
