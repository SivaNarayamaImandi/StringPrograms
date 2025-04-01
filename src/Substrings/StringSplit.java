package Substrings;

import java.util.ArrayList;
import java.util.List;

class StringSplit {

    public static void main(String[] args) {
        String str = "apple,banana,orange";
        char delimiter = ',';
        List<String> parts = splitString(str, delimiter);
        System.out.println(parts);
    }

    public static List<String> splitString(String str, char delimiter) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }

        StringBuilder currentPart = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == delimiter) {
                result.add(currentPart.toString());
                currentPart.setLength(0);
            } else {
                currentPart.append(currentChar);
            }
        }
        result.add(currentPart.toString());
        return result;
    }
}
