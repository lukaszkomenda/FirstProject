package SDA;

import java.util.Scanner;

public class temperaturaSwitch {
    public static void main(String[] args) {
         /*
        Wykorzystujac instrukcje switch zapytaj uzytkownika o temperature.
        Uzyj klasy String W zaleznosci od odpowiedzi wyswietl 35 Jestes przemeczony
        36 Wszystko w normie 37 Mozliwe, ze jestes przeziębiony 38 Chyba jesteś chory
        39 Wysoka temperatura 40 Jak najszybciej skontaktuj sie z lekarzem
         W innym przypadku Brak danych
         */

        System.out.println("Jaką masz temperaturę");
        Scanner s = new Scanner(System.in);
        String temperatura = s.nextLine();

        switch (temperatura){
            case "35":
                System.out.println("Jesteś przemęczony");
                break;
            case "36":
                System.out.println("Wszystko w normie");
                break;
            case "37":
                System.out.println("Możliwe, że jesteś przeziębiony");
                break;
            case "38":
                System.out.println("Chyba jesteś chory");
                break;
            case "39":
                System.out.println("Wysoka temperatura");
                break;
            case "40":
                System.out.println("Jak najszybciej skonsultuj się z lekarzem");
                break;
            default:
                System.out.println("Brak danych");


        }
    }



}
