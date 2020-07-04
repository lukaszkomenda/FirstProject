package SDA;

import java.util.Scanner;

public class wpiszLiczbe {
    public static void main(String[] args) {
//        int liczba;
//        boolean dodatnia;
        int upperbound = 25;
        int lowerbound = -25;

        int liczba = (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);
//        System.out.println("Wpisz liczbę:");
//        Scanner l = new Scanner(System.in);
//        liczba = l.nextInt();

//        if(dodatnia = liczba ==0){
//            System.out.println("Liczba jest równa zero.");
//        } else if(dodatnia = liczba >0){
//            System.out.println("Liczba jest większa niż zero.");
//        } else{
//            System.out.println("Liczba jest mniejsza niż zero.");
//        }
        if (liczba > 0 && liczba <=25){
            System.out.println("Liczba dodatnia z przedziału " + liczba);
        } else if (liczba == 0){
            System.out.println("Liczba zero z przedziału " + liczba);
        } else if (liczba <0 && liczba >= -25){
            System.out.println("Liczba ujemna z przedziału " + liczba);
        } else
        System.out.println("Liczba jest z poza przedziału " + liczba);

    }
}
