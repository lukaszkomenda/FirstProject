package CodingBat;

public class textByIndex {
    public static void main(String[] args) {
        System.out.println(textByIndexMethod("abcdefg", 3));
    }

    private static String textByIndexMethod(String str, int n) {
        String textNew = "";

        for (int i = 0; i < str.length(); i += n) {
            textNew += str.charAt(i);

        }
        return textNew;
    }
}
