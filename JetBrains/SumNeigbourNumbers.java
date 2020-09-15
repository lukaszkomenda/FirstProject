package JetBrains;

import java.util.Arrays;
import java.util.Scanner;

public class SumNeigbourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[array.length - 1] * array[array.length - 2]);
    }
}

