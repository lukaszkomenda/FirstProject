package SDA;

public class Inkrementacja {
    public static void main(String[] args) {

        int iterator = 5;
        int nastepnyIterator = iterator++ + 1;

        System.out.println("nastepnyIterator " + nastepnyIterator);
        System.out.println("iterator " + iterator);
    }
}
