package SophisticatedPackage.basic;

import java.util.Locale;
import java.util.Scanner;

public class FirstNumbers {
    public static void main(String[] args) {

        //kalkulator sumujący liczby
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMANY);
        System.out.println("Podaj pierwszą liczbę");
        double first = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double second = scanner.nextDouble();
        double sum = first + second;

        System.out.println("Suma wprowadzonych liczb to "+ sum);

    }
}
