package SophisticatedPackage.basic;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        // tablica jednowymiarowa
        int[] numbers1 = {10, 45, 99, 102, 34};

        //funkcja skanner umorzliwiająca wybranie zmiennej
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz liczbę");
        int index = scanner.nextInt();

        //obsługa możliwości wpisania liczby poza zakresem
        if (index < numbers1.length)
            System.out.println("Twoja liczba to " + numbers1[index]);
        else
            System.out.println("Twoja liczba wykracza poza zakres tablicy");


    }
}
