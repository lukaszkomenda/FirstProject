package SophisticatedPackage.basic;

public class Methods {
    public static void main(String[] args) {
        sayHelloTo("John");
        sayHelloTo("Juliet");
        sayHelloTo("Adam");

        int x = returnFive()+4;

        System.out.println(x);

    }
    // metoda do klasy Hello
    private static int returnFive(){
        return 5;
    }

    private static void sayHelloTo (String name){
        System.out.println("SophisticatedPackage.basic.Hello, " + name + " nice to meet you!");
    }

}
