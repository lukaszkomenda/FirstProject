package SDA;

import java.util.Arrays;

public class tablicaKopiowanie {
    public static void main(String[] args) {
        int tablica[] = {-1, 0, 2, 5, 10, 15, 100, 201};
        int tablicakopiowana[] = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++){
            tablicakopiowana [i] = tablica [i];
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablicakopiowana));

        tablica[0] = -10;
        tablica[2] = 3;
        tablica[7] = 401;

        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablicakopiowana));




    }
}
