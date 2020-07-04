package SDA;

import java.util.Scanner;

public class ostatniZnak {
    public static void main(String[] args) {
        /*
        Napisac program, który wczytuje od uzytkownika ciag znaków,
        a nastepnie wy- swietla informacje o tym ile razy w tym ciagu
        powtarza sie jego ostatni znak
         */

        System.out.println("Wpisz słowo:");
        Scanner s = new Scanner(System.in);
        String slowo = s.nextLine();

        char ostatniZnak = 'a';
        int iloscZnakow = slowo.length();

        for(int i = 1; i <= iloscZnakow; i++) {
            if (i == iloscZnakow){
                ostatniZnak = slowo.charAt(slowo.length()-1);
            }
        }

        char[] tablicaZnakow = slowo.toCharArray();
        int licznik = 0;


        for(int i = 0; i < tablicaZnakow.length; i++) {
            if(ostatniZnak == tablicaZnakow [i]){
                licznik++;
            }

        }
        System.out.println("W podanym tekscie ostatni znak: " + ostatniZnak + " powtarza się: " + licznik + " razy.");


        }

        }






