package SDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ciagNieparzystych {
    public static void main(String[] args) {
        /*
        Napisac program, który pobiera od uzytkownika liczbe calkowita dodatnia, a na-
         stepnie wyswietla na ekranie kolejno wszystkie liczby niepatrzyste nie wieksze od
         podanej liczby. Przyklad, dla 15 program powinien wyswietlic 1, 3, 5, 7, 9, 11, 13, 15.
         */
        System.out.println("Wpisz liczbę:");
        Scanner s = new Scanner(System.in);
        int liczba = s.nextInt();

        List<Integer> nieparzyste = new ArrayList<Integer>();
        for(int i = 1; i <= liczba; i++) {
            if (i % 2 != 0){
                nieparzyste.add(i);
            }
        }
        System.out.println(nieparzyste.toString());
    }
}
