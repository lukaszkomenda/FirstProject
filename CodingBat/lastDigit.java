package CodingBat;

public class lastDigit {
    public static void main(String[] args) {
        System.out.println(sameLastDigit(3, 113));
    }

    private static boolean sameLastDigit(int a, int b) {
        if ((a % 10) == (b % 10)) {
            return true;
        } else {
            return false;
        }

    }
}
