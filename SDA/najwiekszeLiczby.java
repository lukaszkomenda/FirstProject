package SDA;

import java.util.Scanner;

public class najwiekszeLiczby {
    public static void main(String[] args) {
        int liczbaA;
        int liczbaB;
        int liczbaC;

        Scanner s = new Scanner(System.in);

        System.out.println("Wpisz pierwszą liczbę");
        liczbaA = s.nextInt();

        System.out.println("Wpisz drugą liczbę");
        liczbaB = s.nextInt();

        System.out.println("Wpisz trzecią liczbę");
        liczbaC = s.nextInt();

        if (liczbaA > liczbaB && liczbaA > liczbaC){
            System.out.println("Pierwsza liczba jest największa " + liczbaA);
        } else if(liczbaB > liczbaA && liczbaB > liczbaC){
            System.out.println("Druga liczba jest największa " + liczbaB);
        } else {
            System.out.println("Trzecia liczba jest największa " + liczbaC);
        }
    }
}
