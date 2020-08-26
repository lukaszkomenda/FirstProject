package JetBrains;


import java.util.Scanner;

public class WhenIReachAFortune {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.next());
        double percent = Double.parseDouble(scanner.next());
        int expectedMoney = Integer.parseInt(scanner.next());

        percent /= 100;

        int year = 0;

        while (money < expectedMoney){
            money = money + (money * percent);
            year++;
        }

        System.out.println(year);
    }
}
