package SDA;

import java.util.Scanner;

public class warunkiCzyPelnoletnia {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String imie;
        int wiek;
        boolean czyPelnoletnia;

        System.out.println("Podaj imię:");
        imie = a.nextLine();

        System.out.println("Podaj wiek:");
        wiek = a.nextInt();

        if (czyPelnoletnia = wiek >= 18) {
            System.out.println(imie + " ma " + wiek + " lat. " + "Jest pełnoletni");
        } else {
            System.out.println(imie + " ma " + wiek + " lat. " + "Jest niepełnoletni");

        }

    }
}