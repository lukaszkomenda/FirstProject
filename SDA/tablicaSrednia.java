package SDA;

public class tablicaSrednia {
    public static void main(String[] args) {
        double[] tablica1 = {1.1,4.2,6.4,7.576,10.3467,13.9978,46.3789,62.29932,75.37829,101.273772,202.37827,303.27872,423.37827,507.777227,777.271};
        double licznik = 0;

        for(int i = 0; i < tablica1.length; i++){
            licznik += tablica1[i];
        }
        System.out.println("Sumba liczb to: " + licznik);
        System.out.println("Liczba liczb w tablicy: " + tablica1.length);
        System.out.println("Srednia liczb to: " + (licznik / tablica1.length));
    }
}
