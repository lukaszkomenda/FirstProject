package CodingBat;

public class hiCondition {
    public static void main(String[] args) {
        System.out.println(isHiStarts("hixyz"));
    }

    private static boolean isHiStarts(String str) {
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals("hi")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }


    }
}
