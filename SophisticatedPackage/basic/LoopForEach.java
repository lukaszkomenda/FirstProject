package SophisticatedPackage.basic;

public class LoopForEach {
    /*
    for(Typ_Obiektu nazwa_obiektu : nazwa_tablicy) {...}
    lub
    for(Typ_Obiektu nazwa_kolekcji : nazwa_tablicy) {...}
     */
    public static void main(String[] args) {
        int[] board = new int[10];
        //wypełnienie tablicy
        for(int i =0;i<10;i++){
            board[i] = i + 1;
        }
        //wyświetlanie przy użyciu pętli for each
        for(int x:board){
            System.out.println(x);
        }
    }
}
