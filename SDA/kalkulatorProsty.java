package SDA;

import java.util.Scanner;

public class kalkulatorProsty {
    public static void main(String[] args) {
        double liczba1;
        double liczba2;
        char symbol;

        Scanner a = new Scanner(System.in);

        System.out.println ("Wpisz pierwszą liczbę:");
        liczba1 = a.nextDouble();

        System.out.println("Wpisz drugą liczbę:");
        liczba2 = a.nextDouble();

        System.out.println("Wpisz symbol działania (+, -, :, x):");
        symbol = a.next().charAt(0);

        switch (symbol){
            case '+':
                System.out.println(liczba1 + liczba2);
                break;
            case '-':
                System.out.println(liczba1 - liczba2);
                break;
            case ':':
                System.out.println(liczba1 / liczba2);
                break;
            case 'x':
                System.out.println(liczba1*liczba2);
                break;
            default:
                System.out.println("Wpisz poprawny symbol:");
        }




    }





}
