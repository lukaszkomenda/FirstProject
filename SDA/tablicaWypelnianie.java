package SDA;

import java.util.Arrays;

public class tablicaWypelnianie {
    public static void main(String[] args) {
        int tablica[] = new int[10];

        for(int i = 1; i < tablica.length + 1; i++){
            tablica [i-1] = i;
        }
        System.out.println(Arrays.toString(tablica));
    }
}
