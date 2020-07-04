package SDA;

import java.util.Arrays;

public class tablicaZnakow {
    public static void main(String[] args) {
        /*
        Utworz 26-elementowa tablice typu char. Zapisz w kolejnych komorkach
        male litery alfabetu od a do z.
         */
        char tablica[] = new char[26];
        char znak = 'a';

        for(int i = 0; i < tablica.length; i++) {
            tablica[i] = znak++;
        }

        System.out.println(Arrays.toString(tablica));

    }
}
