package Transformations;

class RunLengthDecoding {

    public static void main(String[] args) {
        String str = "a2b3c1";
        String decoded = decodeString(str);
        System.out.println(decoded);
    }

    public static String decodeString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            char c = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }
}
