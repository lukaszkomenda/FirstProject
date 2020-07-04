package SophisticatedPackage.basic;

public class VariablesText {
    public static void main(String[] args) {

        // wycinanie tekstu i przenoszenie do innej metody
        String hello = "Witaj ";
        String world = "Swiecie!";
        String powitanie = hello + world;
        System.out.println(powitanie);
        String czesc = powitanie.substring(0, 6) + "uczniu";
        System.out.println(czesc);
    }
}
