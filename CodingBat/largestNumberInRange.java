package CodingBat;

public class largestNumberInRange {
    public static void main(String[] args) {
        System.out.println(largestNumberInRangeMethod(10, 21));
    }

    private static int largestNumberInRangeMethod(int a, int b) {
        boolean outOfRangeA = (a > 20) || (a < 10);
        boolean outOfRangeB = (b > 20) || (b < 10);

        if (outOfRangeA == true && outOfRangeB == true) {
            return 0;
        } else {
            if (outOfRangeA == true && outOfRangeB == false){
                return b;
            } else if (outOfRangeA == false && outOfRangeB == true){
                return a;
            } else {
                if (a > b){
                    return a;
                } else if (a == b){
                    return a;
                } else {
                    return b;
                }
            }
        }
    }
}
