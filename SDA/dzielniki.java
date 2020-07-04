package SDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dzielniki {
    public static void main(String[] args) {
        /*
        Zadanie1 Napisac program, dla podanej liczby calkowitej wyswietla
        jej dzielniki. Przykladowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = s.nextInt();

        List<Integer> dzielniki = new ArrayList<Integer>();
        for(int i = 2; i < liczba; i++) {
            if(liczba % i == 0){
                dzielniki.add(i);
            }
        }
        System.out.println(dzielniki.toString());
    }
}
