package SDA;

public class tablicaIloscWystapien {
    public static void main(String[] args) {
        /*
        Utwórz 15 elementową tablicę typu int wypełnioną własnymi
        wartościami z przedziału od 0 do 5. Oblicz ilość wystąpień
        dla poszczególnych wartości. Wyświetl uzyskane wyniki.
         */

        int tablica[] = {0,2,3,4,5,1,3,2,5,0,4,0,4,3};
        int licznik = 0;

        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j < tablica.length; j++) {
                if (tablica[j] == i){
                    licznik++;
                }
            }
            System.out.println("Liczba " + i + " wystąpiła " + licznik + " razy.");
            licznik = 0;
        }
    }
}
