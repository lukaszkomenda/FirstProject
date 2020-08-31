package JetBrains;

import java.util.Scanner;

public class ExpectanceVsResources {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int coffeeCups = scanner.nextInt();

        int howManyCupsFromWater = water / 200;
        int howManyCupsFromMilk = milk / 50;
        int howManuCupsFromBeans = coffeeBeans / 15;

        int cupCanWeMadeFromResourses = Math.min((Math.min(howManyCupsFromWater,
                howManyCupsFromMilk)), (Math.min(howManyCupsFromMilk, howManuCupsFromBeans)));

        int rest;

        if (cupCanWeMadeFromResourses == coffeeCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupCanWeMadeFromResourses > coffeeCups) {
            rest = cupCanWeMadeFromResourses - coffeeCups;
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    rest + " more than that)");
        } else {
            System.out.println("No, I can make only " + cupCanWeMadeFromResourses +
                    "cup(s) of coffee");
        }
    }
}
