package CodeWars;

import java.util.Arrays;

public class Kata {
    public static String treasure(String place) {
        char orient = place.toUpperCase().charAt(3);

        switch (orient) {
            case 'N':
                return "NORTH";
            case 'S':
                return "SOUTH";
            case 'W':
                return "WEST";
            case 'E':
                return "EAST";
            default:
                return "WRONG ORIENTATION";
        }
    }

    public static int toBinary(int n) {

        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return distanceToPump <= (mpg * fuelLeft);
    }

    public static int maxDiff(int[] lst) {

        if (lst.length == 0) {
            return 0;
        } else {
            int minValue;
            int maxValue;

            minValue = Arrays
                    .stream(lst)
                    .min()
                    .getAsInt();

            maxValue = Arrays
                    .stream(lst)
                    .max()
                    .getAsInt();

            return maxValue - minValue;
        }


    }
}
