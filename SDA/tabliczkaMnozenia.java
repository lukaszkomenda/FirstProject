package SDA;

import java.util.Arrays;

public class tabliczkaMnozenia {
    public static void main(String[] args) {
        /*
        1. Utwórz tablicę typu int o wymiarach 10x10.
        2. Wykorzystaj tablicę do przechowywania wartości tabliczki mnożenia.
        3. Wyświetl zawartość tablicy.
         */

        int tablica[][] = new int[11][11];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = i * j;

            }
        }

        for (int[] tab : tablica) {
            System.out.println(Arrays.toString(tab));
            System.out.println();
        }


//        for(int row[] : tablica) {
//            for(int column : row) {
//                System.out.print(column + " ");
//            }
//            System.out.println();
//        }


    }
}
