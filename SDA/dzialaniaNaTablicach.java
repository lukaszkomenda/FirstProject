package SDA;


public class dzialaniaNaTablicach {
    public static void main(String[] args) {
        int tablica[] = {4,12,34,45,67,71,88,99,107,207};
        int suma = 0;
        int licznik = 0;
        int max = tablica [0];
        int min = tablica [0];

        for (int i = 0; i <= (tablica.length - 1); i++){
            if (tablica[i] % 2 !=0){
                suma+=tablica[i];
            }
        }
        System.out.println("Suma liczb nieparzystych wynosi: " + suma);

        suma = 0;

        for (int i = 0; i <= (tablica.length - 1); i++){
            if (tablica[i] % 2 ==0){
                suma+=tablica[i];
                licznik++;
            }
        }
        System.out.println("Srednia liczb parzystych wynosi: " + (suma/licznik));

        for (int i = 0; i <= (tablica.length - 1); i++){
            if (tablica[i] > max){
                max = tablica[i];
            }
        }
        System.out.println("Największa wartość to: " + max);

        for (int i = 0; i <=(tablica.length - 1); i++){
            if (tablica[i] < min){
                min = tablica[i];
            }
        }
        System.out.println("Najmniejsza wartość to: " + min);
    }
}
