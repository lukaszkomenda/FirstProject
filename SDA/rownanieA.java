package SDA;

import java.util.Scanner;

public class rownanieA {
    public static void main(String[] args) {
        int a;
        int x;
        int e;
        double wynikRownania;

        Scanner b = new Scanner(System.in);

        System.out.println("Wpisz A:");
        a = b.nextInt();

        System.out.println("Wpisz X:");
        x = b.nextInt();

        System.out.println("Wpisz E:");
        e = b.nextInt();

        wynikRownania = 1 + (x / (3*a)) + (Math.pow(4,x) / e);
        System.out.println("Wynik to:");
        System.out.format("%.2f%n",wynikRownania);


    }
}
