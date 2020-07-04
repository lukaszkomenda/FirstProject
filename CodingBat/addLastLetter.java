package CodingBat;

public class addLastLetter {
    public static void main(String[] args) {
        System.out.println(addLastLetterMethod("xyz"));
    }

    private static String addLastLetterMethod(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

}
