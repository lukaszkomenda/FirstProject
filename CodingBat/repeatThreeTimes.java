package CodingBat;

public class repeatThreeTimes {
    public static void main(String[] args) {
        System.out.println(repeat("xyzLove"));
    }

    private static String repeat(String str) {
        return str.substring(0, 3).repeat(3);
    }
}
