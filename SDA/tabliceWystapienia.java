package SDA;

import java.util.Scanner;

public class tabliceWystapienia {
    public static void main(String[] args) {
        int tablica[] = {0,1,2,3,4,5,6,7,8,9,10,0,1,2,3};
        int licznikWystapien = 0;

        System.out.println("Wpisz liczbę od 0 do 10:");
        Scanner a = new Scanner(System.in);
        int szukanaLiczba = a.nextInt();

        for (int i = 0; i < tablica.length; i++){
            if (szukanaLiczba == tablica[i]){
                licznikWystapien++;
            }
        }
        System.out.println("Wpisana liczba wystąpiła w tablicy: " + licznikWystapien + " razy.");
    }
}
