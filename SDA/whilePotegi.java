package SDA;

import java.util.Scanner;

public class whilePotegi {
    public static void main(String[] args) {
        double liczbaCalkowita;
        int iterator = 0;

        System.out.println("Podaj liczbę:");
        Scanner a = new Scanner(System.in);
        liczbaCalkowita = a.nextInt();

        while (true){
            double wynikPotegowania = Math.pow(2,iterator);

            if(wynikPotegowania < liczbaCalkowita){
                System.out.println("Wynik potęgi liczby 2 nie większa niż podana liczba " + wynikPotegowania);
            } else {
                return;
            }
            iterator++;
        }
    }
}
