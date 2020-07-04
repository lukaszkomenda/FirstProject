package SDA;

import java.util.Scanner;

public class dzienUrodzenia {
    public static void main(String[] args) {
        //x=[(dzien urodzenia - potęga (4 do potęgi 2 - 4 x rok urodzenia)] : Pi x miesiąc

        int dzienUrodzenia;
        int rokUrodzenia;
        int miesiacUrodzenia;
        double wynikRownania;

        Scanner a = new Scanner(System.in);

        System.out.println("Wpisz dzien urodzenia:");
        dzienUrodzenia = a.nextInt();

        System.out.println("Wpisz miesiac urodzenia:");
        miesiacUrodzenia = a.nextInt();

        System.out.println("Wpisz rok urodzenia:");
        rokUrodzenia = a.nextInt();

        wynikRownania = (dzienUrodzenia - (Math.sqrt(Math.pow(2,4))) - (4*rokUrodzenia)) / (Math.PI * miesiacUrodzenia);

        System.out.println("Wynik równania to " + wynikRownania);


    }
}
