package SophisticatedPackage.basic;

public class Function {
    public static void main(String[] args) {
        double first = 9.0D;
        int second = 3;

        //pierwiastek
        double sqrt = Math.sqrt(first);

        //potęga
        double power = Math.pow(first, (double) second);
        System.out.println("Pierwiastek z " + first + " wynosi: " + sqrt);
        System.out.println("Liczba " + first + " podniesiona do potęgi " + second + " to " + power);
    }
}
