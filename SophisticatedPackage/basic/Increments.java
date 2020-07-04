package SophisticatedPackage.basic;

public class Increments {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);

        //Inkrementacja = jednostka + 1
        a = a++;
        System.out.println(a);
        int c = 10 + a;
        System.out.println(c);
    }
}
