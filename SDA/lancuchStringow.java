package SDA;

import java.util.Scanner;

public class lancuchStringow {
    public static void main(String[] args) {
        /*
        Zadanie6 Napisac funkcje, która jako parametr otrzymuje lancuch znakow. W wyniku
        działania funkcja zwraca liczbe cyfr, które znajdowaly się w podanym lancuchu.
        Ponadto funkcja wyswietla lancuch z pominietymi znakami odpowiadajacymi cyfrom.
        Przyklad: lancuch='asdf23tsdcs3cz2' Funkcja zwroci wartosc: 4 oraz przez
        parametr: 'asdftsdcscz'
         */

        System.out.println("Wpisz tekst z liczbami:");
        Scanner s = new Scanner(System.in);
        String tekst = s.nextLine();
        StringBuilder tekstUworzony = new StringBuilder();

        int licznik = 0;
        char tablicaZnakow[] = tekst.toCharArray();

        for(char znak : tablicaZnakow) {
            boolean czyZnak = Character.isDigit(znak);
            if(czyZnak){
                licznik++;
            } else {
                tekstUworzony.append(znak);
            }
        }
        System.out.println("Ilość liczb w tekście: " + licznik);
        System.out.println("Tekst bez liczb: " + tekstUworzony);

    }
}
