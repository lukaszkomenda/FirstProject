package SDA;

import javax.swing.*;

public class ZadanieDrugie {
    public static void main(String[] args) {

        String imie = "Lukasz";
        int wiek = 16;

        boolean wiekParzysty;
        int wiekZa10lat = wiek + 10;

        int resztaZDzielenia = wiek % 2;
        System.out.println("reszta z dzielenia " + resztaZDzielenia);
        wiekParzysty = resztaZDzielenia == 0;

        System.out.println("Wiek parzysty " + wiekParzysty);

        if(wiek >=18){
            System.out.println(imie + " jest pełnoletni");
        } else{
            System.out.println(imie + " jest niepełnoletni");
        }

        System.out.println(imie + " za 10 lat będzie miał: " + wiekZa10lat);


    }
}
