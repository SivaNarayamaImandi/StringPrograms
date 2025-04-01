package Transformations;

class MySubstring {

    public static void main(String[] args) {
        String str = "hello world";
        String sub1 = mySubstring(str, 6);
        String sub2 = mySubstring(str, 0, 5);
        System.out.println(sub1);
        System.out.println(sub2);
    }

    public static String mySubstring(String str, int beginIndex) {
        if (str == null) {
            return null;
        }

        int endIndex = str.length();
        return mySubstring(str, beginIndex, endIndex);
    }

    public static String mySubstring(String str, int beginIndex, int endIndex) {
        if (str == null) {
            return null;
        }

        if (beginIndex < 0) {
            beginIndex = 0;
        }

        if (endIndex > str.length()) {
            endIndex = str.length();
        }

        if (beginIndex > endIndex) {
            return "";
        }

        if (beginIndex == endIndex){
            return "";
        }

        if (beginIndex == 0 && endIndex == str.length()){
            return str;
        }

        char[] chars = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            chars[i - beginIndex] = str.charAt(i);
        }
        return new String(chars);
    }
}
