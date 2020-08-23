package JetBrains;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {

        /*
        Imagine a chocolate bar. Remember how it is usually split into smaller bits
        by a special grid?

        Now think of chocolate as an N x M rectangle divided into little segments:
        N segments in length and M in width. Each segment is 1x1 and unbreakable.
        Find out whether it is possible to break off exactly K segments from the
        chocolate with a single straight line: vertical or horizontal.

        Input data format

        The program gets an input of three integers: N, M, K.

        Output data format

        The program must output one of the two words: YES or NO.
         */

        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
