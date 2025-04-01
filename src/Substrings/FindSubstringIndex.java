package Substrings;

class FindSubstringIndex {

    public static void main(String[] args) {
        String str = "hello world";
        String sub = "world";
        int index = findSubstringIndex(str, sub);
        System.out.println(index);
    }

    public static int findSubstringIndex(String str, String sub) {
        if (str == null || sub == null || sub.isEmpty()) {
            return str == null ? -1 : 0;
        }
        return str.indexOf(sub);
    }
}
