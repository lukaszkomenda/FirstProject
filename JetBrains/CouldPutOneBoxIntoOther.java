package JetBrains;

import java.util.Arrays;
import java.util.Scanner;

public class CouldPutOneBoxIntoOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] box1 = input1.split(" ");
        String[] box2 = input2.split(" ");

        int[] array1 = Arrays
                .stream(box1)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int[] array2 = Arrays
                .stream(box2)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        if ((array1[0] > array2[0]) && (array1[1] > array2[1]) && (array1[2] > array2[2])){
            System.out.println("Box 1 > Box 2");
        } else if ((array1[0] < array2[0]) && (array1[1] < array2[1]) && (array1[2] < array2[2])){
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
