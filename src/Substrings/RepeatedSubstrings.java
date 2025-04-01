package Substrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RepeatedSubstrings {

    public static void main(String[] args) {
        String str = "banana";
        List<String> repeated = findRepeatedSubstrings(str);
        System.out.println(repeated);
    }

    public static List<String> findRepeatedSubstrings(String str) {
        List<String> repeated = new ArrayList<>();
        if (str == null || str.length() < 2) {
            return repeated;
        }

        Map<String, Integer> subCount = new HashMap<>();
        for (int len = 1; len < str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                String sub = str.substring(i, i + len);
                subCount.put(sub, subCount.getOrDefault(sub, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : subCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeated.add(entry.getKey());
            }
        }

        return repeated;
    }
}
