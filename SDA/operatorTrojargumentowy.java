package SDA;

import java.util.Scanner;

public class operatorTrojargumentowy {
    public static void main(String[] args) {
        int wiek;

        Scanner a = new Scanner(System.in);

        System.out.println("Podaj swój wiek:");
        wiek = a.nextInt();

        System.out.println("Jesteś " + (wiek >= 18 ? "dorosły" : "niepełnoletni"));
    }
}
