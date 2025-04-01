package Substrings;

import java.util.HashSet;
import java.util.Set;

class DistinctSubstrings {

    public static void main(String[] args) {
        String str = "abc";
        int count = countDistinctSubstrings(str);
        System.out.println(count);
    }

    public static int countDistinctSubstrings(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Set<String> distinctSubstrings = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                distinctSubstrings.add(str.substring(i, j));
            }
        }
        return distinctSubstrings.size();
    }
}
