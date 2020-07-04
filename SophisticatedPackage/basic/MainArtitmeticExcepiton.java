package SophisticatedPackage.basic;

public class MainArtitmeticExcepiton {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // obsługa błędu dzielenia przez zero
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0");
        }
    }
}
