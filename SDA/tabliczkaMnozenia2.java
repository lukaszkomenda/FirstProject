package SDA;

public class tabliczkaMnozenia2 {
    public static void main(String[] args) {

        int[][] data = new int[10][10];

        data = tablicaMnozenia(10, 10);


        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                System.out.printf("%2d ", data[row][column]);
            }
            System.out.println();

        }
    }


        public static int[][] tablicaMnozenia(int r, int c)
        {
            int[][] tablica = new int[r][c];
            for (int row = 0; row < tablica.length; row++) {
                for (int column = 0; column < tablica[row].length; column++) {
                    tablica[row][column] = (row + 1) * (column + 1);
                }

            }
            return tablica;
        }
    }