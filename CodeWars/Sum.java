package CodeWars;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            counter += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            counter += arr2[i];
        }

        return counter;
    }
}
