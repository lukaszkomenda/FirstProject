package CodingBat;

public class twoFirstChars {
    public static void main(String[] args) {
        System.out.println(addTwoFirstLetters("xyz"));
    }

    private static String addTwoFirstLetters(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(2) + str.substring(0, 2);
        } else if (str.length() == 1){
            return str + str + str;
        } else {
            return str;
        }
    }
}
