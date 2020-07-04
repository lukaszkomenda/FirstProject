package SDA;

import java.util.Scanner;

public class ciagZnakow {
    public static void main(String[] args) {
        /*
        Napisac program, który wczytuje od uzytkownika ciag znaków, a
        nastepnie two- rzy łancuch bedacy odwróceniem podanego łancucha i
        wyswietla go na ekranie. Przykładowo, dla łancucha „Kot” wynikiem
        powinien byc łancuch „toK”.
         */
        System.out.println("Wpisz słowo:");
        Scanner s = new Scanner(System.in);
        String slowo = s.nextLine();

        StringBuilder odwrocony = new StringBuilder(slowo).reverse();
        System.out.println(odwrocony);
    }
}
