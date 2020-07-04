package SophisticatedPackage.basic;

import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {

        // metoda witająca użytkownika
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstname = scan.nextLine();

        System.out.println("Witaj " + firstname);

    }
}
