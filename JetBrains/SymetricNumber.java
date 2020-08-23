package JetBrains;

import java.util.Scanner;

public class SymetricNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        String value = String.valueOf(input);
        StringBuilder sb = new StringBuilder(value);

        if (value.equals(sb.reverse().toString())){
            System.out.println(1);
        } else {
            System.out.println(2);
        }


    }

}


