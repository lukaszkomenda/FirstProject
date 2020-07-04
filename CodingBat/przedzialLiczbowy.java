package CodingBat;

import java.util.Scanner;

public class przedzialLiczbowy {
    public static void main(String[] args) {
        /*

        Given an int n, return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.

        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz liczbę:");
        int liczba = s.nextInt();

        System.out.println(nearHundred(liczba));


    }
    public static boolean nearHundred(int n) {
        if(n >= 90 && n <= 110 || n >= 190 && n <= 210){
            return true;
        } else {
            return false;
        }
    }



}
