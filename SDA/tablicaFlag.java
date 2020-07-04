package SDA;

import java.util.Arrays;

public class tablicaFlag {
    public static void main(String[] args) {
        /*
        Napisz program, w ktorym zostanie utworzona 10 elementowa tablica typu boolean.
        Komorkom o indeksie parzystym przypisz wartosc true, a nieparzystym false.
        Mozemy zalozyc, ze zero jest parzyste. Tablice wyswietl.
         */

        boolean tablica[] = new boolean[10];

        for (int i = 0; i < tablica.length; i++) {
            if (i % 2 == 0) {
                tablica[i] = true;
            }
        }
        System.out.println(Arrays.toString(tablica));

    }
}
