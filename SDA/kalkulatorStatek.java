package SDA;

import java.util.Scanner;

public class kalkulatorStatek {
    public static void main(String[] args) {
        int ladownoscKontenerow;
        int liczbaKontenerow;
        int sumaWag = 0;

        System.out.println("Podaj ładowność:");
        Scanner l = new Scanner(System.in);
        ladownoscKontenerow = l.nextInt();

        System.out.println("Podaj liczbę kontenerów:");
        liczbaKontenerow = l.nextInt();

        for(int i = 1; i <=liczbaKontenerow; i++){
            System.out.println("Podaj wagę kontenera" +i);
            int wagakontenera = l.nextInt();
            sumaWag = sumaWag + wagakontenera;
        }

        if(sumaWag<ladownoscKontenerow){
            System.out.println("waga kontenerow nie przekracza dopuszczalnej ladownosci: " + sumaWag);
        } else {
            System.out.println("waga kontenerow przekracza dopuszczalnej ladownosci: " + sumaWag);
        }

    }
}
