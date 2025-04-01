package Substrings;

import java.util.ArrayList;
import java.util.List;

class AllSubstrings {

    public static void main(String[] args) {
        String testString = "abc";
        List<String> substrings = findAllSubstrings(testString);
        System.out.println(substrings);
    }

    public static List<String> findAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return substrings;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }
        return substrings;
    }
}
