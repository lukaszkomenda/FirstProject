package JetBrains;

import java.util.Scanner;

public class VacationCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysAmount = Integer.parseInt(scanner.next());
        int costOfFood = Integer.parseInt(scanner.next());
        int costOfFlight = Integer.parseInt(scanner.next());
        int costOfStay = Integer.parseInt(scanner.next());

        System.out.println((costOfFood * daysAmount) + (costOfFlight * 2) +
                (costOfStay * (daysAmount-1)));
    }
}
