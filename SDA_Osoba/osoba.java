package SDA_Osoba;

public class osoba {
    private String imie;
    private String nazwisko;
    private Integer rokUrodzenia;
    private boolean czyPelnoletnia;

    public osoba() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(Integer rokUrodzenia) {
        if(rokUrodzenia >= 1900 && rokUrodzenia <= 2020){
            this.rokUrodzenia = rokUrodzenia;
        } else {
            System.out.println("Wybierz poprawny rok");
        }
    }

    public boolean isCzyPelnoletnia() {
        if(rokUrodzenia != null && (2020 - rokUrodzenia) >= 18){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        String pelnoletnosc = null;
        if (isCzyPelnoletnia()) {
            pelnoletnosc = " Jest pelnoletnia ";
        } else {
            pelnoletnosc = " Nie jest pelnotelnia ";
        }

        String komunikat = "osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' + pelnoletnosc +
                '}';
        return komunikat;
    }
}

