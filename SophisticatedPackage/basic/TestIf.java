package SophisticatedPackage.basic;

public class TestIf {
    public static void main(String[] args) {
        int variable = 5;
        int variable2 = 10;
        int variable3 = 2;
        int variable4 = 0;


        // porównywanie liczb
        if (variable % variable3 ==0){
            System.out.println("Liczba parzysta");}
        else {
            System.out.println("Liczba nieparzysta");}

        if (variable>variable2) {
            System.out.println("Liczba większa od " + variable2);}
        else if (variable>variable4 && variable <=variable2){
            System.out.println("Liczba dodatnia mniejsza, lub równa " + variable2);}
        else {
            System.out.println("Liczba ujemna");}

        }
    }

