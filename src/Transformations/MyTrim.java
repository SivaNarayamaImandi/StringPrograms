package Transformations;

class MyTrim {

    public static void main(String[] args) {
        String str = "  hello world  ";
        String trimmed = myTrim(str);
        System.out.println("'" + trimmed + "'");
    }

    public static String myTrim(String str) {
        if (str == null) {
            return null;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && Character.isWhitespace(str.charAt(start))) {
            start++;
        }

        while (end >= start && Character.isWhitespace(str.charAt(end))) {
            end--;
        }

        if (start > end) {
            return "";
        }

        return str.substring(start, end + 1);
    }
}
