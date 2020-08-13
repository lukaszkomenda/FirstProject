package CodeWars;

public class THB {
    public static String testing(String initial) {
        //Don't goof it up!
        if (initial == null){
            return null;
        } else {
            char[] signArray = initial.toCharArray();
            initial = "";
            for (char c : signArray) {
                if (c == 't' || c == 'h' || c == 'b') {
                    initial += c;
                }
            }
            return initial;
        }
    }
}
