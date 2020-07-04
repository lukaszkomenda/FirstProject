package SophisticatedPackage.basic;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        //== równa się
        //!= różny od
        // && i
        // \\ lub

        //wywołanie metody scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour = scan.nextInt();

        //warunek znamiujący wyświetlenie odpowiedniego wyniku
        if(hour<12){
            System.out.println("Good morning");
        } else if(hour >= 12 && hour<18){
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }

    }
}
