package SDA;

import java.util.Scanner;

public class sredniaIloczyn {
    public static void main(String[] args) {
        /*
        Zadanie5 Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb
        ujemnych oraz iloczyn liczb dodatnich. Liczby wczytywane są od użytkownika, koniec
        wczytywania oznacza podanie liczby 0.
         */

        double czynnik = 1;
        double iloczyn = 0;
        double skladnik = 0;
        double suma = 0;
        int licznik = 0;



        for( ; ;) {
            System.out.println("Wpisz liczbę:");
            Scanner s = new Scanner(System.in);
            double wpisanaLiczba = s.nextDouble();

            if (wpisanaLiczba == 0){
                System.out.println("Iloczyn podanych liczb to: " + iloczyn);
                if(licznik != 0){
                    System.out.println("Srednia podanych liczb to: " + (suma/licznik));
                }
                return;
            } else if (wpisanaLiczba > 0){
                iloczyn = wpisanaLiczba * czynnik;
                czynnik = iloczyn;
            } else {
                suma = wpisanaLiczba + skladnik;
                skladnik = suma;
                licznik++;
            }
        }
        

        


    }
}
