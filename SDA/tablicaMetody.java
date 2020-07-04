package SDA;

import java.util.Arrays;

public class tablicaMetody {
    public static void main(String[] args) {
        /*
        1. Napisz metode print , która wypisze w konsoli elementy tablicy intów , przekazanej jako
        parametr.
        2. Napisz metode getMax , która przyjmie za parametr tablice intów , a która
        zwróci najwieksza wartosc z tej tablicy.
        3. Napisz metode getMin , która zwróci najmniejszy element przekazanej tablicy intów
        4. Napisz metode getLarger , która przyjmie za parametry dwie tablice intów ,
        a która zwróci te tablice, której suma elementów jest wieksza
        5. Utwórz tablice przechowujaca wartosci typu int o rozmiarze zadanym z konsoli.
        Wypelnij ja wartosciami wewnatrz petli for. Zwróc sume tych wartosci.
        6. Stwórz tablice zawierajaca 5 imion. Wewnatrz petli for each dopisuj imiona do
        zmiennej
        typu String, oddzielajac je przecinkami. Wyswietl utworzony lancuch znaków. Np.
        „Malgorzata, Jan, Jakub”.
         */
        int tablica[] = new int[15];
        String tablicaImion[] = {"Andrzej", "Tomasz", "Lukasz", "Antoni", "Piotr"};

        for (int i = 1; i <= tablica.length; i++) {
            tablica[i-1] = i;
        }

        System.out.println(print(tablica));
        System.out.println(getMax(tablica));
        System.out.println(print(getLarger(tablica, 5)));
        System.out.println(getSum(tablica));
        System.out.println(printText(tablicaImion));

    }
    public static String print (int[] tablica){
        return Arrays.toString(tablica);
    }

    public static String printText (String[] tablica){
        return Arrays.toString(tablica);
    }

    public static int getMax (int[] tablica){
        int max = 0;
        for (int i = 0; i <= tablica.length; i++) {
            if (max >= i){
                max = max;
            } else {
                max = i;
            }
        }
        return max;
    }

    public static int[] getLarger (int[] tablica, int liczba){
        int[] tablicaNowa = new int[15];
        for (int i = 0; i < tablicaNowa.length; i++) {
            if (liczba < tablica[i]){
                tablicaNowa[i] = i;
            }
        }
        return tablicaNowa;
    }

    public static int getSum (int[] tablica){
        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            licznik += tablica[i];
        }
        return licznik;
    }



}
