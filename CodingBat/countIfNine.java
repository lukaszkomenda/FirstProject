package CodingBat;

public class countIfNine {
    public static void main(String[] args) {
        int[] array = {1, 9, 9, 3, 9};

        System.out.println(countIfNineMethod(array));
    }

    private static int countIfNineMethod(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

}
