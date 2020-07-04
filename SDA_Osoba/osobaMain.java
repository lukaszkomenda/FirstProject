package SDA_Osoba;

public class osobaMain {
    public static void main(String[] args) {
        /*
        Utworz klase Osoba. Klasa niech posiada pola imie, nazwisko,
        rok urodzenia w formie int. Pola niech beda prywatne. Utworz
        gettery i settery. Na setterze roku urodzenia ustaw weryfikacje,
        aby mozna bylo ustawic wiek w przedziale 1900 - 2020. Dodaj metode
        zwracajaca true/false, ktora informuje czy osoba jest pelnolentia.
        Nadpisz metode toString(), tak aby wyswietlala imie, nazwisko i
        informacje, czy osoba jest pelnoletnia. Utworz obiekt i przetestuj
        dzialanie metody.
         */

        osoba osoba1 = new osoba();
        osoba1.setImie("Lukasz");
        osoba1.setNazwisko("Komenda");
        osoba1.setRokUrodzenia(1990);

        System.out.println(osoba1.toString());

    }
}
