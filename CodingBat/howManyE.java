package CodingBat;

public class howManyE {
    public static void main(String[] args) {
        System.out.println(isNumberEInRange("Heelel"));
    }

    private static boolean isNumberEInRange(String str) {
        int counter = 0;
        char e = 'e';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == e) {
                counter++;
            }
        }

        if (counter >= 1 && counter <= 3) {
            return true;
        } else {
            return false;

        }

    }
}
