package SDA;

import java.util.Scanner;

public class wielkieLiteryMetoda {
    public static void main(String[] args) {
        /*
        1. Utwórz własną funkcję o nazwie UpperCase , której zadaniem będzie zmiana
        podanego tekstu na tekst składający się tylko i wyłącznie z wielkich liter.
        Np.
        Zamieni napis „Przykładowy tekst :)” na „PRZYKŁADOWY TEKST :)”
         */

        System.out.println("Wpisz tekst");
        Scanner s = new Scanner(System.in);
        String tekst = s.nextLine();
        System.out.println(wielkieLitery(tekst));


    }
    public static String wielkieLitery (String name){
        String result = name.toUpperCase();
        return result;
    }
}
