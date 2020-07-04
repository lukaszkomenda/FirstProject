package SDA;

public class liczbyZaokraglenieMetoda {
    public static void main(String[] args) {
        double liczba = 4.566432;

        System.out.println(zaokraglenie(liczba));

    }

    private static double zaokraglenie (double liczba){
        double result = Math.round(liczba);
        return result;
    }
}
