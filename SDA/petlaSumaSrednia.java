package SDA;

import java.util.Scanner;

public class petlaSumaSrednia {
    public static void main(String[] args) {
        /*
        Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
        Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
        podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.
        Przykład: 4 2 3 6 1 6 1 0 Wynik: 7 1 2
         */

        int suma = 0;
        int liczbaElementow = 0;
        int podzielnePrzezTrzy = 0;

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("Podaj liczbę: ");
            int wartoscWpisana = s.nextInt();
            if(wartoscWpisana == 150){
                suma += wartoscWpisana;
                if (wartoscWpisana % 3 == 0){
                    podzielnePrzezTrzy++;
                }
                break;
            } else {
                suma += wartoscWpisana;
                liczbaElementow++;
                if (wartoscWpisana % 3 == 0){
                    podzielnePrzezTrzy++;
                }
            }
        }
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Srednia wynosi: " + (suma /liczbaElementow));
        System.out.println("Liczba liczb podzielnych przez 3: " + podzielnePrzezTrzy);
    }
}
