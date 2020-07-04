package CwiczeniaPraktyczneJavaMarcinLis;

import java.util.Scanner;

public class poleKola {
    public static void main(String[] args) {
        double promien;
        double poleKola;

        Scanner s = new Scanner(System.in);

        System.out.println("Podaj promień koła");
        promien = s.nextDouble();

        poleKola = Math.PI * Math.pow(promien,2);
        System.out.println("Pole koła wynosi: " + poleKola);
    }
}
