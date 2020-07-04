package SDA;

import java.util.Arrays;
import java.util.Scanner;

public class tablicaWieloelementowa {
    public static void main(String[] args) {
        /*
        Napisac program, który: • utworzy tablice 10 liczb całkowitych i
        wypełni ja wartosciami używając klasy Scanner • wypisze na ekranie
        zawartosc tablicy, • wyznaczy najmniejszy oraz najwieszy element w
        tablicy, • wyznaczy srednia arytmetyczna elementów tablicy, •
        wyznaczy ile elementów jest mniejszych, ile wiekszych od sredniej.
        • wypisze na ekranie zawartosc tablicy w odwrotnej kolejnosci,
        tj. od ostatnie- go do pierwszego.
         */

        int tablica[] = new int[10];

        System.out.println("Wpisz wartości tablicy: ");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            tablica[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(tablica));

        int min = tablica[0];
        int max = tablica[0];

        for(int i = 0; i < 10; i++) {
            if (tablica[i] < min){
                min = tablica[i];
            }

            if (tablica[i] > max){
                max = tablica[i];
            }

        }

        System.out.println("Liczba min " + min);
        System.out.println("Liczba max " + max);

        int suma = 0;

        for(int i = 0; i < 10; i++) {
            suma +=tablica[i];
        }

        double srednia = suma/10;
        System.out.println("Srednia to: " + srednia);

        int sumaWiekszych = 0;
        int sumaMniejszych = 0;

        for(int i = 0; i < 10; i++) {
            if (tablica[i] > srednia){
                sumaWiekszych++;
            }
            if (tablica[i] < srednia){
                sumaMniejszych++;
            }

        }

            System.out.println("Liczba większych " + sumaWiekszych);
            System.out.println("Liczba mniejszych " + sumaMniejszych);

            for(int j = 9; j >= 0; j--) {
                System.out.print(tablica[j]);
                System.out.print(" ");
            }




    }
}
