package SDA;

import java.util.Arrays;

public class tablicaWypelnianie3 {
    public static void main(String[] args) {
          /*
    Napisz program, w ktorym zostanie utworzona 10-elementowa tablica liczb typu int.
    Za pomoca petli for uzupelnij tablice wartosciami od 101 do 110. Wyswietl tablice.
     */
        int tablica[] = new int[10];

        for(int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 101;
        }
        System.out.println(Arrays.toString(tablica));

    }

}
