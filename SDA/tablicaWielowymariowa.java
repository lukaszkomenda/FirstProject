package SDA;

import java.util.Arrays;

public class tablicaWielowymariowa {
    public static void main(String[] args) {
        /*
        Utwórz tablice wielowymiarowa int 3 X 5 i wypelnij ja dowolonymi
        wartosciami w trakcie deklaracji. Wyswietl elementy tablicy.
         */

        int [][] tablicaWielowymiarowa = {
                {10,20,30},
                {30,40,50},
                {60,70,100}
        };

        for(int row[] : tablicaWielowymiarowa) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
