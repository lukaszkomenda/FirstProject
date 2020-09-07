package JetBrains;

import java.util.Scanner;

public class numberInRangeTwoOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());
        int number3 = Integer.parseInt(scanner.next());

        if (number1 >= number2 && number1 <= number3){
            System.out.println(true);
        } else if (number1 >= number3 && number1 <= number2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
