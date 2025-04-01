package Transformations;

class StringToInt {

    public static void main(String[] args) {
        String str1 = "123";
        int num1 = stringToInt(str1);
        System.out.println(num1);
    }

    public static int stringToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
