package CodingBat;

public class bigLastThreeLetters {
    public static void main(String[] args) {
        System.out.println(newTextWithThreeLastLetters("xyzl"));
    }

    private static String newTextWithThreeLastLetters(String str) {
        int length = str.length();

        if (length >= 4) {
            return str.substring(0, length - 3) + str
                    .substring(length - 3, length)
                    .toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }

}
