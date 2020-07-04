package SDA;

import java.util.Scanner;

public class kalkulatorMetody {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        double liczba1 = s.nextDouble();

        System.out.println("Wpisz drugą liczbę: ");
        double liczba2 = s.nextDouble();

        System.out.println("Wpisz symbol działania (+, -, :, x):");
        char symbol = s.next().charAt(0);

        switch (symbol){
            case '+':
                dodawanie(liczba1, liczba2);
                break;
            case '-':
                odejmowanie(liczba1, liczba2);
                break;
            case ':':
                dzielenie(liczba1, liczba2);
                break;
            case 'x':
                mnozenie(liczba1, liczba2);
                break;
            default:
                return;
        }

    }

    public static double dodawanie (double liczba1, double liczba2){
        double wynik = liczba1 + liczba2;
        System.out.println(wynik);
        return wynik;
    }

    public static double odejmowanie (double liczba1, double liczba2){
        double wynik = liczba1 - liczba2;
        System.out.println(wynik);
        return wynik;
    }

    public static double mnozenie (double liczba1, double liczba2){
        double wynik = liczba1 * liczba2;
        System.out.println(wynik);
        return wynik;
    }

    public static double dzielenie (double liczba1, double liczba2){
        double wynik = liczba1 / liczba2;
        System.out.println(wynik);
        return wynik;
    }
}
