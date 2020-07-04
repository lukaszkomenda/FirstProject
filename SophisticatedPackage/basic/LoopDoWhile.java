package SophisticatedPackage.basic;

public class LoopDoWhile {
    /*
    do{
        instrukcje do wykonania
    }
    while(warunek);
     */
    public static void main(String[] args) {
        int counter = 0;

        //pętla rób coś do spełnienia warunku
        do {
            System.out.println("To jest moja pętla");
            counter++;
        }
        while (counter<4);
        System.out.println("Koniec pętli");
    }
}
