package SDA;

import java.util.stream.DoubleStream;

public class PierwszyProgram {
    public static void main(String[] args) {

//        char k = 'k';
//        int sto = 100;
//        String kbis = "k";
//        String wyrazNaKonsole = "Hello World! " + k + sto;
//
//        //Tutaj jest mój pierwszy program
//        System.out.println("Hello World!");
//        System.out.println("kot");
//        System.out.println(k);
//        System.out.println(sto);
//        System.out.println(wyrazNaKonsole);
//        //System.exit(); wyłączanie programu
//        //System.clearProperty() czyszczenie pamięci

        int wartosc = 1000;
//        byte bajt = 2 + wartosc;

        int wiek = 1;
        int wyrok = 2;
        int przepustka = 1;
        int wiekPoWyjsciu = wiek + wyrok + przepustka;

        double wartoscZPrzecinkiem = 4.4;
        double suma = wartoscZPrzecinkiem + wyrok;
        System.out.println(suma);

        //castowanie zmiennych = zmiana typu zmiennych
        int wynik  = wyrok + (int)wartoscZPrzecinkiem;

        int duzaLiczba = 3000;
        byte malyBajt = (byte)duzaLiczba;

//        System.out.println("Wiek z bazy danych: " + wiek);
////        System.out.println("Wyrok: " + wyrok);
////        System.out.println("Wiek po wyjściu: " + wiekPoWyjsciu);
        System.out.println(wynik);
        System.out.println(malyBajt);
    }
}
