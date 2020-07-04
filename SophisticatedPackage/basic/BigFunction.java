package SophisticatedPackage.basic;

import java.math.BigInteger;

public class BigFunction {
    public static void main(String[] args) {

        //tworzenie zmiennych o dużych wartościach
        BigInteger first = new BigInteger("123123123123123123123123123123123");
        BigInteger second = new BigInteger("98989898989898989898989898989898");

        //sumowanie zmiennych o dużych wartościch
        BigInteger sum = first.add(second);

        //wyświetlenie wyniku
        System.out.println("Suma " + sum.toString());
    }
}
