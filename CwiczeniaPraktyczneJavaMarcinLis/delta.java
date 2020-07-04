package CwiczeniaPraktyczneJavaMarcinLis;

import java.util.Scanner;

public class delta {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner ab = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę:");
        a = ab.nextDouble();
        System.out.println("Wpisz drugą liczbę:");
        b = ab.nextDouble();
        System.out.println("Wpisz trzecią liczbę:");
        c = ab.nextDouble();

        double delta = Math.pow(b,2) - 4 * a * c;

        System.out.println("Delta wynosi: " + delta);

    }
}
