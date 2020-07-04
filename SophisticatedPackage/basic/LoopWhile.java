package SophisticatedPackage.basic;

public class LoopWhile {
    /*
    while(warunek){
        instrukcje do wykonania
    }
     */
    public static void main(String[] args) {
        int counter = 0;

        // pętla rób coś do spełnienia warunku
        while (counter<10){
            System.out.println("To jest pętla");
            counter++;
        }
        System.out.println("Koniec pętli");
    }
}
