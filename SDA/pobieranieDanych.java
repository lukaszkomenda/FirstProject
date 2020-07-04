package SDA;

import java.util.Scanner;

public class pobieranieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz imię ");
        String imie = scanner.nextLine();

        System.out.println("Wpisz wiek ");
        int wiek = scanner.nextInt();

        System.out.println("Wpisane imię to " + imie);
        System.out.println("Wpisany wiek to " + wiek);

    }
}
