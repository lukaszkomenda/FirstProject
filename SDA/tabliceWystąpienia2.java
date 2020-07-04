package SDA;



public class tabliceWystąpienia2 {
    public static void main(String[] args) {
        int tablica[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3};
        int licznikWystapien = 0;

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <tablica.length; j++){
                if(i == tablica [j]){
                    licznikWystapien++;
                }
            }
            System.out.println("Liczba " + i + " wystąpiła " + licznikWystapien + " razy.");
            licznikWystapien = 0;
        }


    }
    }

