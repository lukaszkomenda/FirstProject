package CodingBat;

public class nineInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9};
        System.out.println(isNineInArray(array));
    }

    private static boolean isNineInArray(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

}
