package SDA;

import java.util.Arrays;

public class tablicaWypelnianie4 {
    public static void main(String[] args) {
        /*
        Napisz program, ktory utworzy 100-elementowa tablice liczb typu int.
        Komorkom o indeksach 0, 10, 20, ..., 90 przypisz wartosc 0, komorkom
        1, 11, 21, ..., 91 wartosc 1, komorkom 2, 12, 22, ..., 92 wartosc 2 itd.
         */

        int tablica[] = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i;
            if (tablica[i] % 10 == 0) {
                tablica[i] = 0;
            } else if (tablica[i] % 10 == 1) {
                tablica[i] = 1;
            } else if (tablica[i] % 10 == 2) {
                tablica[i] = 2;
            } else if (tablica[i] % 10 == 3) {
                tablica[i] = 3;
            } else if (tablica[i] % 10 == 4) {
                tablica[i] = 4;
            } else if (tablica[i] % 10 == 5) {
                tablica[i] = 5;
            } else if (tablica[i] % 10 == 6) {
                tablica[i] = 6;
            } else if (tablica[i] % 10 == 7) {
                tablica[i] = 7;
            } else if (tablica[i] % 10 == 8) {
                tablica[i] = 8;
            } else {
                tablica[i] = 9;
            }
            System.out.println(Arrays.toString(tablica));


        }
    }
}
