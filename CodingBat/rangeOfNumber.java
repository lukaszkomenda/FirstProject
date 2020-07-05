package CodingBat;

public class rangeOfNumber {
    public static void main(String[] args) {
        System.out.println(isNumbersInRightRange(12,99));
    }

    private static boolean isNumbersInRightRange(int a, int b) {
        if (a >= 10 && a <= 20){
            return true;
        } else {
            if (b >= 10 && b <= 20){
                return true;
            } else {
                return false;
            }
        }
    }
}
