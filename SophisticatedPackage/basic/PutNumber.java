package SophisticatedPackage.basic;

import java.util.Scanner;

public class PutNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        System.out.println("Podaj napis:");
        String word = scanner.nextLine();

        System.out.println(word + " " + number);
    }
}
