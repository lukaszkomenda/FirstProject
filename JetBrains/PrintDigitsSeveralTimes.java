package JetBrains;

import java.util.Scanner;

public class PrintDigitsSeveralTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= times; i++) {
            for (int j = 1; j <= i; j++) {
                if (counter == times){
                    return;
                } else {
                    System.out.print(i + " ");
                    counter++;
                }
            }
        }
    }
}
