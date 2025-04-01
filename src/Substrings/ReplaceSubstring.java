package Substrings;

class ReplaceSubstring {

    public static void main(String[] args) {
        String testString = "abababa";
        String result = replaceAllOccurrences(testString, "aba", "c");
        System.out.println(result);
    }

    public static String replaceAllOccurrences(String str, String target, String replacement) {
        if (str == null || target == null || replacement == null || target.isEmpty()) {
            return str;
        }

        return str.replace(target, replacement);
    }
}
