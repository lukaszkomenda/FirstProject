package SDA_Pracownik;

public class mainMetody {

        // PracownikMetody

    public static void main(String[] args) {
        PracownikMetody pracownik = new PracownikMetody("Lukasz","Komenda",30,"30.10.2013",3900);
        PracownikMetody pracownik1 = new PracownikMetody("Agata", "Grabarczyk", 27, "01.01.2018", 3500);
        System.out.println(pracownik.getImie() + " " + pracownik1.getImie());
        System.out.println(pracownik.getNazwisko() + " " + pracownik1.getNazwisko());
        System.out.println(pracownik.getWiek() + " " + pracownik1.getWiek());
        System.out.println(pracownik.getDataZatrudnienia() + " " + pracownik1.getDataZatrudnienia());
        System.out.println(pracownik.getWynagrodzenie() + " " + pracownik1.getWynagrodzenie());
    }



    }

