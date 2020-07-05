package CodingBat;

public class prefixStarts {
    public static void main(String[] args) {
        String text = "mix xyz";
        System.out.println(isPrefix(text));
    }

    private static boolean isPrefix(String str) {
        if (str.length() >= 3){
            if (str.substring(1, 3).equals("ix")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
