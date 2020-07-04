package SophisticatedPackage.basic;

public class Scope {
    static int x;

    public static void main(String[] args) {
        x=5;
        System.out.println(x);

        // wywoływanie metod
        doSomething();

        doSomethingLocally();
    }

    // wywoływanie zmiennych statycznych lub dynamicznych
    private static void doSomething () {
        x=10;
        System.out.println(x);
    }

    private  static void doSomethingLocally(){
        int y= 100;
        System.out.println(x*y);
    }
}
