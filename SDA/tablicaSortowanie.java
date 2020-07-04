package SDA;

import java.util.Arrays;

public class tablicaSortowanie {
    public static void main(String[] args) {
        double tablicaDoSortowania [] = {3.23, -12.12, 1.5, -4.4567, 2.456, -2.5, -0.345, 0.456};
        double temp = 0;

        //bubble sort
        for (int i = 0; i < tablicaDoSortowania.length - 1; i++){
            for (int j = 0; j < tablicaDoSortowania.length - 1; j++){
                if (tablicaDoSortowania [j] > tablicaDoSortowania[j + 1]){
                    temp = tablicaDoSortowania[j];
                    tablicaDoSortowania[j] = tablicaDoSortowania[j+1];
                    tablicaDoSortowania[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(tablicaDoSortowania));
    }
}
