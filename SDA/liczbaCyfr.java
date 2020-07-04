package SDA;

public class liczbaCyfr {
    public static void main(String[] args) {
        /*
        Napisac program, który sumuje cyfry w tekscie podanym przez uzytkownika.
         */

        String zdanie = "95-070";

        int suma = 0;

        char[] tablica = zdanie.toCharArray();

        for(char znak : tablica) {
            boolean czyZnak = Character.isDigit(znak);
            if (czyZnak){
                int wartosc = Character.getNumericValue(znak);
                suma += wartosc;
            }
        }
        System.out.println(suma);
    }
}
