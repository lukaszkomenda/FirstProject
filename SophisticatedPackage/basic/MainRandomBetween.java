package SophisticatedPackage.basic;

import java.util.Random;

public class MainRandomBetween {
    public static void main(String[] args) {

        for(int j = 0; j < 100; j++){
            System.out.println(randomBetween(10, 100));
        }
    }
    //wyświetlanie losowych wartości w zakresie
    static int randomBetween(int start, int end){
        Random random = new Random();

        int a1 = random.nextInt(end - start + 1); //0_90
        int a2 = a1 + start; //10_100
        return a2;
    }
}
