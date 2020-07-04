package SDA;

public class wywolywanieMetody {
    public static void main(String[] args) {
        String wynik = helloName("Bob");
        System.out.println(wynik);

    }


    public static String helloName (String name){
        String result = "Hello " + name + "!";
        return result;
    }
}
