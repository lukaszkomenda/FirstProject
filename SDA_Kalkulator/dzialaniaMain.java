package SDA_Kalkulator;

import java.util.Scanner;

public class dzialaniaMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Wpisz pierwszą liczbę: ");
        double pierwszaLiczba = s.nextDouble();

        System.out.println("Wpisz drugą liczbę: ");
        double drugaLiczba = s.nextDouble();

        dzialania dzialanie = new dzialania(pierwszaLiczba,drugaLiczba);

        System.out.println(dzialanie);

        System.out.println("Pierwiastek pierwszej liczby: " + pierwiastek(pierwszaLiczba));
        System.out.println("Pierwiastek drugiej liczby: " + pierwiastek(drugaLiczba));
        System.out.println("Potega pierwszej liczby: " + potega(pierwszaLiczba));
        System.out.println("Potega drugiej liczby: " + potega(drugaLiczba));


    }
    public static double pierwiastek (double liczba){
        double result = Math.sqrt(liczba);
        return result;
    }

    public static double potega (double liczba){
        double result = Math.pow(liczba,2);
        return result;
    }
}