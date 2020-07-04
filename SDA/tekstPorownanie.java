package SDA;

import java.util.Scanner;

public class tekstPorownanie {
    public static void main(String[] args) {

        // alternatywna metoda do metody w klasie xDoWhile
        String wprowadzonyTekst;
        String wzorzec = "x";

        Scanner a = new Scanner(System.in);

        do{
            System.out.println("Podaj znak");
            wprowadzonyTekst = a.nextLine();
        } while (!(wprowadzonyTekst.equals(wzorzec)));
    }
}
