package CodingBat;

public class numbersInRange {
    public static void main(String[] args) {
        System.out.println(isNumbersInRangeMethod(30, 31));
    }

    private static boolean isNumbersInRangeMethod(int a, int b) {
        if ((a >= 30) && (a <= 40) && (b >= 30) && (b <= 40)) {
            return true;
        } else {
            if ((a >= 40) && (a <= 50) && (b >= 40) && (b <= 50)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
