package SophisticatedPackage.basic;

import java.util.Scanner;

public class CompareNames {
    public static void main(String[] args) {

        //utworzenie metody skanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię 1:");
        String name1= scanner.nextLine();
        System.out.println("Podaj imię 2:");
        String name2= scanner.nextLine();

        //warunek porównania
        if (name1.equals(name2)){
            System.out.println("Imiona są takie same");
        } else {
            System.out.println("Imiona są różne");
        }
    }
}
