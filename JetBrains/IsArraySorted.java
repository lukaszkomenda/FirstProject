package JetBrains;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IsArraySorted {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(isArraySorted(array));

    }

    private static boolean isArraySorted(int[] array) {
        return IntStream
                .range(0, array.length - 1)
                .noneMatch(i -> array[i] > array[i + 1]);
    }
}
