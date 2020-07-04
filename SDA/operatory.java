package SDA;

public class operatory {
    public static void main(String[] args) {

        final int wiekKlientaA = 10;
        int wiekKlientaB = 20;
        int progSprzedazy = 18;

        boolean czySprzedacAlkoholA = wiekKlientaA >= progSprzedazy;
        boolean pelnoletnosc = wiekKlientaB >= progSprzedazy;
        boolean maksymalnyWiek = wiekKlientaB > 50;

        System.out.println("pelnoletnosc " + wiekKlientaB + " " + pelnoletnosc);
        System.out.println("maksymalnyWiek " + maksymalnyWiek);

//        boolean kryteriaSpelnione = pelnoletnosc || maksymalnyWiek;

        System.out.println("Czy sprzedać klientowi A: " + czySprzedacAlkoholA);

        boolean kryteriaSpelnione = pelnoletnosc && maksymalnyWiek;

        // ! znak negacji
        boolean isNotTenYearsOldA = wiekKlientaA != 10;

        System.out.println("Klienta S ma 10 lat " + isNotTenYearsOldA);
    }
}
