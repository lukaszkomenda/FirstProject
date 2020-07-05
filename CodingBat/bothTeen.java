package CodingBat;

public class bothTeen {
    public static void main(String[] args) {
        System.out.println(isBothTeen(13, 13));
    }

    private static boolean isBothTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        } else {
            if (a >= 13 && a <= 19) {
                return true;
            } else {
                if (b >= 13 && b <= 19) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
