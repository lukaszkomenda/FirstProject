package SDA;

import java.util.Arrays;

public class tablicaWielowymiarowaRandom {
    public static void main(String[] args) {
        /*
        Utworz tablice wielowymiarowa int 5 x 5 i wypelnij ja losowymi liczbami
        z przedzialu 0 - 100. Uzyj do tego metody (int)
        Math.floor(Math.random() * 101). Wyswietl elementy tablicy.
        Policz sume wszystkich elemenów. Policz srednia wartosc elementu.
        Znajdz najmnieszy i najwiekszy element
         */

        int[][] tablica = new int[5][5];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = (int) Math.floor(Math.random() * 101);
            }
        }

// Nie mozemy wypelni tablicy stosujac ponizsza petle for each, ponieważ zmienna iteracyjna moze byc tylko odczytana,
// gdyz jest zwiazana z przegladana tablica. Przypisanie zmiennej iteracyjnej jakiejs wartosci nie ma zadnego wplywu na tablice
//        for(int[] tab: tablica){
//            for(int value : tab){
//                value = (int) Math.floor(Math.random() * 101);
//            }
//        }

        for (int[] tab : tablica) {
            System.out.println(Arrays.toString(tab));
            System.out.println();
        }


//        Obliczenia
        int sumaElementow = 0;
        int maxElement = tablica[0][0];
        int minElement = tablica[0][0];
        int liczbaElementow = 0;
        for (int[] tab : tablica) {
            for (int value : tab) {
                sumaElementow = sumaElementow + value;
                if(value > maxElement){
                    maxElement = value;
                }
                if(value < minElement){
                    minElement = value;
                }
                liczbaElementow++;
            }
        }
        double srednia = (double)sumaElementow /  liczbaElementow;

        System.out.println("Suma " + sumaElementow);
        System.out.println("Srednia " + srednia );
        System.out.println("Najwiekszy element " + maxElement);
        System.out.println("Najmniejszy element " + minElement);





    }
}
