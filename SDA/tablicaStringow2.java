package SDA;

import java.util.Arrays;
import java.util.Scanner;

public class tablicaStringow2 {
    public static void main(String[] args) {
        /*
        Utworz tablice Stringów o rozmiarze 5 i wypelni ja imionami uzywajac
        klasy Scanner. Niech chociaz jedno imie bedzie dluzsze niz 5 znakow.
        Ustandaryzuj imiona tak, aby wszystkie byly zapisnae malymi literami.
        Przekopiuj imiona do nowej tablicy zastap imiona dluzsze ni 5 znakow
        stringiem "Imie zbyt dlugie". Wyswietl informacje na konsoli ile imion
        zostalo skopiowanych a ile bylo zbyt dlugich. Wyswietl zawartosc skopiowanej tablicy.
         */

        String imiona[] = new String[5];

        System.out.println("Wpisz imię");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < imiona.length; i++){
            imiona[i] = s.nextLine();

        }

        String imiona2[] = imiona;

//        System.out.println(Arrays.toString(imiona).toLowerCase());

        int licznikNieprawidlowych = 0;
        int licznikPrawidlowych = 0;

        for(int i = 0; i < imiona2.length; i++){
            if (imiona2[i].length() > 6){
                imiona2[i] = "Imię zbyt długie";
                licznikNieprawidlowych++;
            } else {
                licznikPrawidlowych++;
            }
        }

        System.out.println(Arrays.toString(imiona2).toLowerCase());
        System.out.println("Liczba imion nieprawidlowo wpisanych: " + licznikNieprawidlowych);
        System.out.println("Liczba imion prawidłowo wpisanych: " + licznikPrawidlowych);




//        for(int i = 0; i < imiona.length; i++) {
//            String pierwszaLitera;
//            String ostatniaLitera;
//
//            pierwszaLitera = imiona[i].substring(0,1);
//            ostatniaLitera = imiona[i].substring(imiona[i].length() - 1);
//
//            System.out.println("Pierwsza litera imienia: " + imiona[i].toUpperCase() + " to: " + pierwszaLitera);
//            System.out.println("Ostatnia litera imienia: " + imiona[i].toUpperCase() + " to: " + ostatniaLitera);
//        }
//
//        for(int i = 0; i < imiona.length; i++) {
//            int dlugoscImienia = 0;
//            dlugoscImienia = imiona[i].length();
//            System.out.println("Imię: " + imiona[i].toUpperCase() + " ma " + dlugoscImienia + " znaków.");
//        }




    }
}
