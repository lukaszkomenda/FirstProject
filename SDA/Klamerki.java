package SDA;

import java.util.Scanner;

public class Klamerki {
    public static void main(String[] args) {
        int liczba = 5;
        {
            int liczba1 = 6;
            System.out.println(liczba1);

        }

        System.out.println(liczba);
        // zmiennych wewnątrz klamerek nie można wywołać spoza nich
        //błąd: System.out.println(liczba1);
    }



}
