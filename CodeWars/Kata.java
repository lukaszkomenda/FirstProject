package CodeWars;

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
}
