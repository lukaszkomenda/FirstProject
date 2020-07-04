package SDA;

import java.util.Scanner;

public class ciagLiczb {
    public static void main(String[] args) {

        /*
        Napisac program pobierajacy od uzytkownika dwie liczby calkowite A oraz
        B, A < B, a nastepnie wyznaczajacy sume ciagu liczb od A do B, czyli sume ciagu
        (A,A + 1, . . . ,B). Obliczenia nalezy wykonac trzykrotnie stosujac kolejno petle:
        while, do-while, for. Przyklad: Dla A = 4 i B = 11 program powinien wyswietlic: 60 60 60
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę A");
        int liczbaA = s.nextInt();

        System.out.println("Podaj liczbę B");
        int liczbaB = s.nextInt();

        int liczbaC = liczbaA;
        int liczbaD = liczbaB;

        int liczbaE = liczbaA;
        int liczbaF = liczbaB;

        if(liczbaA > liczbaB){
            System.out.println("Liczba A większa od liczby B.");
            return;
        } else {
            int licznik = 0;
            int licznikB = 0;
            int licznikC = 0;
            for(int i = liczbaA; i <= liczbaB; i++) {
                licznik += liczbaA;
                liczbaA++;
            }

            while (liczbaC <= liczbaD){
                licznikB += liczbaC;
                liczbaC++;
            }

            do {
                licznikC += liczbaE;
                liczbaE++;
            } while (liczbaE <= liczbaF);


            System.out.println("Suma ciągu liczb wynosi: " + licznik + " " + licznikB + " " + licznikC);
        }

    }
}
