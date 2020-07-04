package SDA;

import java.util.Arrays;

public class tablicaWypelnianie2 {
    public static void main(String[] args) {
        /*
        Napisz program, w ktorym zostanie utworzona 10-elemntowa tablica liczb typu int.
        Uzyj petli for do wypelnienia jej danymi w taki sposob, aby w kolejnych kmorkach
        znalazły się liczby od 10 do 100 (czyli 10, 20, 30 itd.). Zawartosc tablicy
        wyświetl na ekranie.
         */

        int tablica[] = new int[10];

        for(int i = 0; i < tablica.length; i++) {
            tablica[i] = (i+1) * 10;
        }
        System.out.println(Arrays.toString(tablica));
    }
}
