package SDA;

import java.util.Arrays;
import java.util.Scanner;


public class porownanieLiczby {
    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            array[i] = s.nextInt();
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}