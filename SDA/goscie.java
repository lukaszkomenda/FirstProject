package SDA;

import java.util.Scanner;

public class goscie {
    public static void main(String[] args) {

        String[] imiona = new String[5];
        imiona[0] = "Jan";
        imiona[1] = "Tomek";
        imiona[2] = "Lukasz";
        imiona[3] = "Janusz";
        imiona[4] = "Arek";

        System.out.println("Sprawdź czy jesteś na liście. Podaj imie:");

        Scanner s = new Scanner(System.in);

        while (true){

            String podaneImie = s.nextLine();

            for(int i = 0; i < imiona.length; i++){
                String jedenElement = imiona[i];
                //zabezpieczenie przed nullpointerexception
                if (jedenElement !=null && jedenElement.equals(podaneImie)){
                    System.out.println("Jesteś na liście.");
                    return;
                }

            }
            System.out.println("Niestety nie jesteś na liście.");
        }
    }
}
