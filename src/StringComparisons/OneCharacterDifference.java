package StringComparisons;

class OneCharacterDifference {

    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";
        boolean result = isOneCharacterDifference(str1, str2);
        System.out.println(result);
    }

    public static boolean isOneCharacterDifference(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        int len1 = str1.length();
        int len2 = str2.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        int diffCount = 0;
        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) {
            if (str1.charAt(i) != str2.charAt(j)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
                if (len1 > len2) {
                    i++;
                } else if (len2 > len1) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        if (i < len1 || j < len2) {
            diffCount++;
        }
        return diffCount == 1;
    }
}
