package JetBrains;


import java.util.Scanner;

public class ChessQueen {
    public static void main(String[] args) {

        /*
        You are given coordinates of two queens on a
        chess board. Find out whether or not they hit each other.

        Input data format

        Four integer numbers x_1, y_1, x_2, y_2x
        1
        ​
         ,y
        1
        ​
         ,x
        2
        ​
         ,y
        2
        ​
 .

        Output data format

        Type "YES" (uppercase) if they hit each other or "NO" if they don't.

        You may need a method that calculates the absolute value of the number, so here it is:

        Math.abs(n)
         */


        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int num3 = Integer.parseInt(scanner.next());
        int num4 = Integer.parseInt(scanner.next());

        if (num1 == num3) {
            System.out.println("YES");
        } else if (num2 == num4) {
            System.out.println("YES");
        } else if (Math.abs(num1 - num3) == Math.abs(num2 - num4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
