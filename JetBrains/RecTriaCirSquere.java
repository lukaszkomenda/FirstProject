package JetBrains;

import java.util.Scanner;

public class RecTriaCirSquere {

    public static void main(String[] args) {

        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double sideA = scanner.nextDouble();
                double sideB = scanner.nextDouble();
                double sideC = scanner.nextDouble();

                double s = (sideA + sideB + sideC) / 2.0d;
                double x = (s * (s - sideA) * (s - sideB) * (s - sideC));
                double area = Math.sqrt(x);

                System.out.println(area);
                break;
            case "rectangle":
                double sideD = scanner.nextDouble();
                double sideE = scanner.nextDouble();
                System.out.println(sideD * sideE);
                break;
            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(PI * radius * radius);
                break;
            default:
                System.out.println("Wrong type of shape");
        }
    }
}
