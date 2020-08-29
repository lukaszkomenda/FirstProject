package JetBrains;

import java.util.Scanner;

public class IsNumberComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }

    private static boolean isComposite(long number) {

        int counter = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
            {
                counter++;
            }
        }
        return counter > 0;

    }
}
