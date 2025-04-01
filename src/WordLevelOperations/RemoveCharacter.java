package WordLevelOperations;

class RemoveCharacter {

    public static void main(String[] args) {
        String str = "hello world";
        char charToRemove = 'l';
        String result = removeCharacter(str, charToRemove);
        System.out.println(result);
    }

    public static String removeCharacter(String str, char charToRemove) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
