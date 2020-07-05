package CodingBat;

public class textRepeatTimesPrefix {
    public static void main(String[] args) {
        System.out.println(textRepeatTimesPrefixMethod("Chocolate", 3));
    }

    private static String textRepeatTimesPrefixMethod(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }
}

