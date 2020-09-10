package JetBrains;

import java.util.Scanner;

public class FrequencyNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int findNumber = scanner.nextInt();
        int counter = 0;

        for (int j : array) {
            if (j == findNumber) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
