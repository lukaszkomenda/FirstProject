package SDA;

public class laczenieStringow {
    public static void main(String[] args) {
        /*
        1. Utwórz obiekt klasy string korzystając z „” o nazwie referencyjnej
        tekst =Dziś zajęcia rozpoczęły się
        2. Następnie utwórz obiekt, korzystając z operatora new o nazwie referencyjnej
        godzina= 9:00.
        3. Połącz łańcuchy w jeden obiekt o nazwie wynik
        4. Korzystając z metody . substring wybierz dwa dowolne wyrazy i zapisz je do
        nowych zmiennych.
        5. Zmierz ich długość oraz wyświetl pierwszy i ostatni znak.
        6. Wyniki wyświetl na ekranie.
         */

        String tekst = "Dzis zajecia rozpoczely się o: ";
        String godzina = new String("9:00");

        String wynik = tekst + godzina;

        System.out.println(wynik);

        String dzis = wynik.substring(0,4);
        String zajecia = wynik.substring(5,12);

        System.out.println("Długosc zmiennej dzis to: " + dzis.length() + " znaki.");
        System.out.println("Długosc zmiennej zajecia to: " + zajecia.length() + " znakow.");


    }
}
