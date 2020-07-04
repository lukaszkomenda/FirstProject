package SophisticatedPackage.basic;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {

        //metoda random wybieranie losowych wartości
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            boolean b = random.nextBoolean();
            System.out.println(b);
        }
    }
}
