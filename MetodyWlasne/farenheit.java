package MetodyWlasne;


import java.util.Scanner;

public class farenheit {
    public static void main(String[] args) {
        /*
        °C = (°F − 32) /1.8
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz liczbę stopni Celcjiusza:");
        double celcjiusz = s.nextDouble();

        System.out.println("Tyle to stopni Farenheita: " + zamianaCelcjuszyNaFarenheity(celcjiusz));

    }
    private static double zamianaCelcjuszyNaFarenheity (double celcjusz){
        double result = 1.8 * celcjusz + 32;
        return result;
    }

}
