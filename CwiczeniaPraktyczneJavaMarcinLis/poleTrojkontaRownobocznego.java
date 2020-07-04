package CwiczeniaPraktyczneJavaMarcinLis;

import java.util.Scanner;

public class poleTrojkontaRownobocznego {
    public static void main(String[] args) {
        double bok;

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz długość boku trójkąta równobocznego:");
        bok = s.nextDouble();

        double poleTrojkonta = (bok * Math.sqrt(3) / 2) * bok / 2;
        System.out.println("Pole trójkąta wynosi: " + poleTrojkonta);
    }
}
