package MetodyWlasne;

public class inwestycja {
    public static void main(String[] args) {
        double inwest = 14000;
        double pierwszyRok = 1.4 * inwest;
        double drugiRok = pierwszyRok - 1500;
        double trzeciRok = 1.12 * drugiRok;

        System.out.println(Math.round(trzeciRok));

    }

}
