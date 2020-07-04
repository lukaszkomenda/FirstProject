package SDA;

import java.util.Scanner;

public class whileParzyste {
    public static void main(String[] args) {

        int liczba;
        int i = 0;

        System.out.println("Podaj liczbę:");
        Scanner b = new Scanner(System.in);
        liczba = b.nextInt();

        while (i<liczba){
            boolean dodatnia = i >0;
            boolean nieparzysta = (i%2) !=0;

            if (dodatnia && nieparzysta){
                System.out.println(i);
            }
            i++;
        }

    }

}
