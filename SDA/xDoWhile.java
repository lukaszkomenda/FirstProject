package SDA;

import java.util.Scanner;

public class xDoWhile {
    public static void main(String[] args) {
        char znak = 'x';

        System.out.println("Wpisz znak:");
        Scanner c = new Scanner(System.in);

        do{
            znak = c.nextLine().charAt(0);

        } while (znak != 'x');
        System.out.println("Wpisano poprawny znak");
    }
}
