package SDA;

public class tablicaWielowymiarowaPodmiana {
    public static void main(String[] args) {
        /*
        1. Utwórz tablicę double o 4 wierszach i 5 kolumnach.
        2.Wykorzystaj pętle do wyświetlenia wartości wszystkich wartości.
        3. Podmień dwie wartości: w 1 wierszu i 3 kolumnie na liczbę 2.25 oraz w 4
        kolumnie i 3 wierszu na 3.
        4. Wyświetl zawartość tablicy po podmianie wartości.
         */

        double tablica[][] = new double[4][5];

        for(double row[] : tablica) {
            for(double column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();

        tablica[1][3] = 2.25;
        tablica[3][4] = 3;

        for(double row[] : tablica) {
            for(double column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
