package SDA;

import java.util.Scanner;

public class trojkont {
    public static void main(String[] args) {
        double bok1;
        double bok2;
        double bok3;

        Scanner a = new Scanner(System.in);

        System.out.println("Wprowadz dlugosc boku 1:");
        bok1 = a.nextDouble();

        System.out.println("Wprowadz dlugosc boku 2:");
        bok2 = a.nextDouble();

        bok3 = Math.sqrt(Math.pow(bok1,2) + Math.pow(bok2,2));
        System.out.println("Dlugosc boku 3 to: " + bok3);
        System.out.println("Obwód trójkonta to: " + (bok1 + bok2 + bok3));
    }
}
