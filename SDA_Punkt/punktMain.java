package SDA_Punkt;

import java.util.Scanner;

public class punktMain {



    public static void main(String[] args) {
        /*
        1. Utwórz klasę Punkt2D.
        2. Dodaj stosowne pola, konstruktory oraz metody get i set wykorzystując
        słowo kluczowe this
        3. Do klasy dodaj metodę, która jako parametr przyjmuje dwa punkty, a
        następnie oblicza długość pomiędzy nimi.
        4. Utwórz kilka obiektów, a następnie wypisz poszczególne wartości pól oraz
        oblicz odległość pomiędzy dwoma punktami.
         */

        punkty2D punkt1 = new punkty2D(1,2);
        punkty2D punkt2 = new punkty2D(3,4);

        System.out.println("Wpisz współrzędne pierwszego punktu:");
        Scanner s = new Scanner(System.in);

        System.out.println("X:");
        punkt1.setX(s.nextDouble());

        System.out.println("Y:");
        punkt1.setY(s.nextDouble());

        System.out.println("Wpisz współrzędne drugiego punktu:");
        System.out.println("X:");
        punkt2.setX(s.nextDouble());

        System.out.println("Y:");
        punkt2.setY(s.nextDouble());

        double wynik = dlugosc(punkt2.x, punkt1.x, punkt2.y, punkt1.y);

        System.out.println("Długosc pomiędzy punktami wynosi: " + wynik);



    }
    public static double dlugosc (double x2, double x1, double y2, double y1){



        double result = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        return result;
    }

}
