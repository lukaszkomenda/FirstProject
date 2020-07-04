package SDA;

import java.util.Arrays;

public class tablicaKopiowanieMetoda {
    public static void main(String[] args) {
        int tablica[] = {-1, 0, 2, 5, 10, 15, 100, 201};
        int tablicakopiowana[] = Arrays.copyOf(tablica, tablica.length);

        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablicakopiowana));

        tablica[2] = 1;

        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablicakopiowana));




    }
}
