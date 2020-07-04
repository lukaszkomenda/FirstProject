package SDA;

import java.util.Scanner;

public class PetlaParzyste {
    public static void main(String[] args) {
        int liczba;

        System.out.println("Wpisz liczbę");
        Scanner x = new Scanner(System.in);
        liczba = x.nextInt();

        for(int i = 1; i < liczba; i++){
            System.out.println("Iterator i " + 1);
            if((i%2) == 0){
                System.out.println("Liczba " + i + " jest parzysta");
            } else
                System.out.println("Liczba " + i + " jest nieparzysta");
        }

    }
}
