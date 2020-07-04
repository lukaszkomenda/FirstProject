package SklepNarzedzia;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Napisz aplikacje, która:
        a) Bedzie posiadala tablice jednowymiarowa skladajaca sie z 3 elementów typu String:
        kombinerek, nozyczek i srubokretu.
        b) Pobierze imie uzytkownika.
        c) Wypisze na ekran: „Witaj <imie>! W naszej ofercie mamy: ” + lista elementów z
        tablicy produktów zdefiniowanych w podpunkcie a, kazdy w nowej linii zaczynajacy
        sie od myslnika + „Co chcialbys
        d) Za posrednictwem petli
        switch case przeanalizuj wybór uzytkownika, dla opcji default wypisz „Takiego
        produktu nie mamy w ofercie”
        e) Dla prawidlowego wyboru usun dany element z tablicy i potwierdz
        uzytkownikowi wybrany produkt.
        f) Potwierdz usuniecie elementu z listy poprzez jej ponowne wyswietlenie.
        g) W przypadku blednego wyboru produktu pozwól na ponowny wybór tak dlugo,
        az uzytkownik nie napisze do widzenia
         */

        String asortyment[] = {"kombinerki", "nożyczki", "śrubokręt"};



        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz swoje imię:");

        String imie = s.nextLine();
        System.out.println("Witaj " + imie + ". " + "\nW naszej ofercie mamy: ");

        for (int i = 0; i < asortyment.length; i++) {
            System.out.println("- " + asortyment[i]);
        }

        for (; ; ) {
            System.out.println("Wybierz towar, który Cię interesuje:");
            String wybor = s.nextLine();
            switch (wybor.toLowerCase()){
                case "kombinerki":
                    System.out.println("Kupiłeś kombinerki");
                    asortyment[0] = "brak";
                    System.out.println("Pozostały asortyment to:");
                    for (int i = 0; i < asortyment.length; i++) {
                        System.out.println("- " + asortyment[i]);
                    }
                    break;
                case "nożyczki":
                    System.out.println("Kupiłeś kombinerki");
                    asortyment[1] = "brak";
                    System.out.println("Pozostały asortyment to:");
                    for (int i = 0; i < asortyment.length; i++) {
                        System.out.println("- " + asortyment[i]);
                    }
                    break;
                case "śrubokręt":
                    System.out.println("Kupiłeś kombinerki");
                    asortyment[2] = "brak";
                    System.out.println("Pozostały asortyment to:");
                    for (int i = 0; i < asortyment.length; i++) {
                        System.out.println("- " + asortyment[i]);
                    }
                    break;
                case "do widzenia":
                    return;
                default:
                    System.out.println("Takiego towaru nie mamy w ofercie.");
            }

        }

    }
}
