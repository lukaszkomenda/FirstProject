package Overriding;

public class Subclass extends Base {

    // tworzenie subklasy
    public static void main(String[] args) {
        Subclass s = new Subclass();
    }
    public Subclass(){
        sayHello();
    }
}
