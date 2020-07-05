package CodingBat;

public class rightTemperature {
    public static void main(String[] args) {
        System.out.println(isRightTemperature(-1, 101));
    }

    private static boolean isRightTemperature(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }

    }
}
