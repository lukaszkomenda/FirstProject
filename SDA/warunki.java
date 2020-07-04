package SDA;

import java.util.Scanner;

public class warunki {
    public static void main(String[] args) {

        int przepracowaneGodziny;
        double pensja = 5000;
        boolean premia;

        Scanner s = new Scanner(System.in);

        System.out.println("Podaj liczbę przepracowanych godzin:");
        przepracowaneGodziny = s.nextInt();

        if(premia = przepracowaneGodziny >= 200){
            System.out.println("Warunek spełniony");
            pensja = pensja * 1.1;
            System.out.println("Pensja wynosi: " + pensja);
        } else {
            System.out.println("Przykro mi nie będzie premii");
            pensja = pensja;
            System.out.println("Pensja wynosi: " + pensja);
        }

    }
}
