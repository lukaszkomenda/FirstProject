package SophisticatedPackage.basic;

public class LogicOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // operatory logiczne
        boolean result1 = a > b;
        boolean result2 = a < b;

        // równa się
        boolean result3 = a == b;

        // i, oraz
        boolean koniunkcja1 = result1 && result3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(koniunkcja1);
    }
}
