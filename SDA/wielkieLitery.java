package SDA;

import java.util.Scanner;

public class wielkieLitery {
    public static void main(String[] args) {
        String tekst;

        System.out.println("Wpisz tekst:");
        Scanner a = new Scanner(System.in);

        tekst = a.nextLine();
        System.out.println(tekst.toUpperCase());


    }
}
