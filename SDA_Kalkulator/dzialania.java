package SDA_Kalkulator;

public class dzialania {
    private double liczba1;
    private double liczba2;
    private double wynikDodawania;
    private double wynikOdejmowania;
    private double wynikMnozenia;
    private double wynikDzielenia;

    public dzialania(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.wynikDodawania = liczba1 + liczba2;
        this.wynikOdejmowania = liczba1 - liczba2;
        this.wynikMnozenia = liczba1 * liczba2;
        this.wynikDzielenia = liczba1 / liczba2;
    }

    public double getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(double liczba1) {
        this.liczba1 = liczba1;
    }

    public double getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(double liczba2) {
        this.liczba2 = liczba2;
    }

    public double getWynikDodawania() {
        return wynikDodawania;
    }

    public void setWynikDodawania(double wynikDodawania) {
        this.wynikDodawania = wynikDodawania;
    }

    public double getWynikOdejmowania() {
        return wynikOdejmowania;
    }

    public void setWynikOdejmowania(double wynikOdejmowania) {
        this.wynikOdejmowania = wynikOdejmowania;
    }

    public double getWynikMnozenia() {
        return wynikMnozenia;
    }

    public void setWynikMnozenia(double wynikMnozenia) {
        this.wynikMnozenia = wynikMnozenia;
    }

    public double getWynikDzielenia() {
        return wynikDzielenia;
    }

    public void setWynikDzielenia(double wynikDzielenia) {
        this.wynikDzielenia = wynikDzielenia;
    }

    @Override
    public String toString() {
        return "dzialania{" +
                "liczba1 to: " + liczba1 +
                ", liczba to: " + liczba2 +
                ", wynik Dodawania to: " + wynikDodawania +
                ", wynik Odejmowania to: " + wynikOdejmowania +
                ", wynik Mnozenia to: " + wynikMnozenia +
                ", wynik Dzielenia to: " + wynikDzielenia +
                '}';
    }
}
