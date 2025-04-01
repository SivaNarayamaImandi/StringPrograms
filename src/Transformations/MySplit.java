package Transformations;

import java.util.ArrayList;
import java.util.List;

class MySplit {

    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String delimiter = ",";
        List<String> parts = mySplit(str, delimiter);
        System.out.println(parts);
    }

    public static List<String> mySplit(String str, String delimiter) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        if (delimiter == null || delimiter.isEmpty()){
            result.add(str);
            return result;
        }

        int delimiterLength = delimiter.length();
        int start = 0;
        int end = str.indexOf(delimiter);

        while (end != -1) {
            result.add(str.substring(start, end));
            start = end + delimiterLength;
            end = str.indexOf(delimiter, start);
        }

        result.add(str.substring(start));
        return result;
    }
}
