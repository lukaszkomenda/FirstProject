package CodingBat;

public class oneTwoThreeSequence {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 1, 2, 3};
        System.out.println(isOneTwoThreeSequence(array));
    }

    private static boolean isOneTwoThreeSequence(int[] nums) {

        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;
    }
}
