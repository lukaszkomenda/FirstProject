package SDA;

import java.util.Scanner;

public class zaMaloZaDuzo {
    public static void main(String[] args) {
        /*
        Gra w ”Za duzo, za malo”. Komputer losuje liczbe z zakresu 1 . . . 100,
        a gracz (uzytkownik) ma za zadanie odgadnac, co to za liczba poprzez podawanie
        kolejnych wartosci. Jezeli podana wartosc jest: • wieksza – wyswietlany jest
        komunikat „Podales za duza wartosc”, • mniejsza – wyswietlany jest komunikat
         „Podales za mala wartosc”, • identyczna z wylosowana – wyswietlany jest komunikat
        „Gratulacje” i gra sie konczy.
         */

        byte wylosowanaLiczba = (byte) (Math.random() * 100);

        for ( ; ; ) {
            System.out.println("Podaj liczbę od 1 do 100:");
            Scanner s = new Scanner(System.in);
            byte liczba = s.nextByte();

            if (liczba == wylosowanaLiczba){
                System.out.println("Gratulacje!");
                return;
            } else if (liczba > wylosowanaLiczba){
                System.out.println("Podałeś za dużą liczbę.");
            } else {
                System.out.println("Podałeś za małą liczbę");
            }
        }
    }
}
