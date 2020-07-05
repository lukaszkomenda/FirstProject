package CodingBat;

public class teenager {
    public static void main(String[] args) {
        System.out.println(isTeen(13, 20, 10));
    }

    private static boolean isTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else {
            if (b >= 13 && b <= 19) {
                return true;
            } else {
                if (c >= 13 && c <= 19) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
