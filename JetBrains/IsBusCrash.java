package JetBrains;

import java.util.Scanner;

public class IsBusCrash {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int busHeight = Integer.parseInt(scanner.next());
        int bridgeValue = Integer.parseInt(scanner.next());

        for (int i = 1; i <= bridgeValue; i++) {
            if (busHeight >= Integer.parseInt(scanner.next())){
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }
        System.out.println("Will not crash");

    }
}
