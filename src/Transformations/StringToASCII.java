package Transformations;

import java.util.Arrays;

class StringToASCII {

    public static void main(String[] args) {
        String str = "hello";
        int[] asciiArray = stringToASCII(str);
        System.out.println(Arrays.toString(asciiArray));
    }

    public static int[] stringToASCII(String str) {
        if (str == null) {
            return null;
        }

        int[] asciiArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            asciiArray[i] = (int) str.charAt(i);
        }
        return asciiArray;
    }
}
