package CodingBat;

public class delText {
    public static void main(String[] args) {
        String text = "xdelyz";
        System.out.println(delTextMethod(text));
    }

    private static String delTextMethod(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }
}
