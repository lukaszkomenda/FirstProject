package SDA;

import java.util.Scanner;

public class petleWhileDoWhile {
    public static void main(String[] args) {

        int i = 4;
        int j = 11;

        System.out.println("Wpisz liczbę:");
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        System.out.println("Wpisz liczbę:");
        j = s.nextInt();

        while (i <= j){
            System.out.println("Java");
            i++;
        }
    }
}
