package SDA;

import java.util.Scanner;

public class liczbaDziesiecMetoda {
    public static void main(String[] args) {
        /*
        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę:");
        int liczba1 = s.nextInt();

        System.out.println("Wpisz drugą liczbę:");
        int liczba2 = s.nextInt();

        System.out.println(makes10(liczba1, liczba2));


    }

    public static boolean makes10(int a, int b) {
        if(((a+b) == 10) || a == 10 || b == 10){
            return true;
        } else {
            return false;
        }
    }
}
