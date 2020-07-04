package SDA;

import java.util.Scanner;

public class wpiszLiczbeSwitch {
    public static void main(String[] args) {
        int liczba;

        System.out.println("Wpisz liczbę");
        Scanner b = new Scanner(System.in);
        liczba = b.nextInt();

        switch (liczba){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Wpisz poprawną liczbę");




        }

    }
}
