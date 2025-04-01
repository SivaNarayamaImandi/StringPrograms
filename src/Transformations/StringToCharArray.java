package Transformations;

class StringToCharArray {

    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = stringToCharArray(str);
        System.out.println(java.util.Arrays.toString(charArray));
    }

    public static char[] stringToCharArray(String str) {
        if (str == null) {
            return null;
        }
        return str.toCharArray();
    }
}
