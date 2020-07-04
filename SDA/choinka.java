package SDA;

import java.util.Scanner;

public class choinka {
    public static void main(String[] args) {

        int wysokoscChoinki;
        char choinka = '*';

        Scanner a = new Scanner(System.in);

        System.out.println("Wpisz wysokość choinki:");
        wysokoscChoinki = a.nextInt();

        for (int i = 1; i<=wysokoscChoinki; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(choinka);
            }
            System.out.println();
        }
    }
}
