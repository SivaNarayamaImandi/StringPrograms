package Transformations;

class MyIndexOf {

    public static void main(String[] args) {
        String str = "hello world";
        String target = "world";
        int index = myIndexOf(str, target);
        System.out.println(index);

        String str2 = "hello world";
        String target2 = "abc";
        int index2 = myIndexOf(str2, target2);
        System.out.println(index2);

        String str3 = "aaaaa";
        String target3 = "aa";
        int index3 = myIndexOf(str3, target3);
        System.out.println(index3);
    }

    public static int myIndexOf(String str, String target) {
        if (str == null || target == null || target.isEmpty()) {
            return str == null ? -1 : 0;
        }

        int strLen = str.length();
        int targetLen = target.length();

        if (targetLen > strLen) {
            return -1;
        }

        for (int i = 0; i <= strLen - targetLen; i++) {
            int j;
            for (j = 0; j < targetLen; j++) {
                if (str.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == targetLen) {
                return i;
            }
        }
        return -1;
    }
}
