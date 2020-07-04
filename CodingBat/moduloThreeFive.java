package CodingBat;

public class moduloThreeFive {
    public static void main(String[] args) {
        System.out.println(moduloThreeFiveMethod(15));
    }

    private static boolean moduloThreeFiveMethod(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
