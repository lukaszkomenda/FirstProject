package SDA;

import java.util.Arrays;
import java.util.Scanner;

public class tablicaStringow {
    public static void main(String[] args) {
        /*
        Utworz tablice Stringów o rozmiarze 5 i wypelni ja imionami
        uzywajac klasy Scanner. Ustandaryzuj imiona tak, aby wszystkie
        byly zapisnae duzymi literami. Wyswietl wszystkie imiona.
        Za imieniem dodaj informacje zgodnie z przyklaem: JAN -
        pierwsza litera J ostatnia N - dlugosc imienia wynosi 3
         */

        String imiona[] = new String[5];

        System.out.println("Wpisz imię");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < imiona.length; i++){
            imiona[i] = s.nextLine();
        }


        System.out.println(Arrays.toString(imiona).toUpperCase());

        for(int i = 0; i < imiona.length; i++) {
            String pierwszaLitera;
            String ostatniaLitera;

            pierwszaLitera = imiona[i].substring(0,1);
            ostatniaLitera = imiona[i].substring(imiona[i].length() - 1);

            System.out.println("Pierwsza litera imienia: " + imiona[i].toUpperCase() + " to: " + pierwszaLitera);
            System.out.println("Ostatnia litera imienia: " + imiona[i].toUpperCase() + " to: " + ostatniaLitera);
        }

        for(int i = 0; i < imiona.length; i++) {
            int dlugoscImienia = 0;
            dlugoscImienia = imiona[i].length();
            System.out.println("Imię: " + imiona[i].toUpperCase() + " ma " + dlugoscImienia + " znaków.");
        }



    }
}
