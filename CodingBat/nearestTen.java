package CodingBat;

public class nearestTen {
    public static void main(String[] args) {
        System.out.println(whichNearestTen(8, 13));
    }

    private static int whichNearestTen(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        } else {
            return a;
        }
    }

}
