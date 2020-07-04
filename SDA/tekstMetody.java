package SDA;

import java.util.Scanner;

public class tekstMetody {
    public static void main(String[] args) {
        /*
        1. Stworz klase o dowolnej nazwie i metode statyczna, ktora bedzie przyjmowac
        dwa parametry typu String, zamieniac je na
        duze litery, laczyc i wyswietlac na konsoli,
        2. Przerob powyzsza metode tak, aby uzywala
        StringBuilder
        3. Stworz metode ktora bedzie zwracala zawsze pierwszy znak z podanego jako argument
        ciagu znakow.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz tekst 1");
        String test1 = s.nextLine();

        System.out.println("Wpisz tekst 2");
        String test2 = s.nextLine();

        System.out.println(tekstZmieniony(test1, test2));
        System.out.println("Pierwszy znak pierwszego słowa to: " + pierwszyZnak(test1));
        System.out.println("Pierwszy znak drugiego słowa to: " + pierwszyZnak(test2));

    }

    public static StringBuilder tekstZmieniony(String x, String y) {
        StringBuilder tekstUtworzony = new StringBuilder(x.toUpperCase()).append(y.toUpperCase());
        return tekstUtworzony;
    }

    public static char pierwszyZnak(String x) {
        char pierwszyZnak = x.charAt(0);

        return pierwszyZnak;
    }
}

