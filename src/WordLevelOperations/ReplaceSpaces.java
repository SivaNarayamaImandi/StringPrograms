package WordLevelOperations;

class ReplaceSpaces {

    public static void main(String[] args) {
        String str = "hello world this is a test";
        String result = replaceSpaces(str);
        System.out.println(result);
    }

    public static String replaceSpaces(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "%20");
    }
}
