package SophisticatedPackage.basic;

import java.math.BigDecimal;

public class BigFunctionInSmallData {
    public static void main(String[] args) {

        //tworzenie zmiennych zmiennoprzecinkowych w celu ich podziału
        BigDecimal a = new BigDecimal("9.5");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("0.33");

        //wyświetlenie wyniku dzielenia zmiennych
        System.out.println(a.divide(b).multiply(c));
    }
}
