package JetBrains;

import java.util.Scanner;


public class CoffeeMachine {

    private static Scanner S;

    public static void main(String[] args) {


        System.out.println("Write action (buy, fill, take):");
        S = new Scanner(System.in);

        while (true) {
            String action = S.next();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                default:
                    System.out.println("Write correct action");
            }
        }


    }

    static class Cappuccino {

        private int water = 200;
        private int milk = 100;
        private int coffeeBeans = 12;
        private int disposableCups = 1;
        private int cost = 6;

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffeeBeans() {
            return coffeeBeans;
        }

        public int getDisposableCups() {
            return disposableCups;
        }

        public int getCost() {
            return cost;
        }
    }

    static class Latte {
        private int water = 350;
        private int milk = 75;
        private int coffeeBeans = 20;
        private int disposableCups = 1;
        private int cost = 7;

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffeeBeans() {
            return coffeeBeans;
        }

        public int getDisposableCups() {
            return disposableCups;
        }

        public int getCost() {
            return cost;
        }
    }

    static class Espresso {
        private int water = 250;
        private int milk = 0;
        private int coffeeBeans = 16;
        private int disposableCups = 1;
        private int cost = 4;

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffeeBeans() {
            return coffeeBeans;
        }

        public int getDisposableCups() {
            return disposableCups;
        }

        public int getCost() {
            return cost;
        }
    }

    static class MachineContains{
        private int water = 400;
        private int milk = 540;
        private int coffeeBeans = 120;
        private int disposableCups = 9;
        private int money = 550;

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffeeBeans() {
            return coffeeBeans;
        }

        public int getDisposableCups() {
            return disposableCups;
        }

        public int getMoney() {
            return money;
        }
    }

    private static void take() {
        MachineContains machineContains = new MachineContains();

        System.out.println("I gave you " + machineContains.getMoney());

        System.out.println(
                "The coffee machine has:\n" +
                        (machineContains.getWater()) + " of water\n" +
                        (machineContains.getMilk()) + " of milk\n" +
                        (machineContains.getCoffeeBeans())
                        + " of coffee beans\n" +
                        (machineContains.getDisposableCups()) +
                        " of disposable cups\n" +
                        (0)
                        + " of money");

    }

    private static void fill() {
        MachineContains machineContains = new MachineContains();

        System.out.println("Write how many ml of water do you want to add:");
        int water = S.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = S.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeBeans = S.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int disposableCups = S.nextInt();

        System.out.println(
                "The coffee machine has:\n" +
                        (machineContains.getWater() + water) + " of water\n" +
                        (machineContains.getMilk() + milk) + " of milk\n" +
                        (machineContains.getCoffeeBeans() + coffeeBeans)
                        + " of coffee beans\n" +
                        (machineContains.getDisposableCups() + disposableCups) +
                        " of disposable cups\n" +
                        machineContains.getMoney() + " of money");
    }

    private static void buy() {
        System.out.println("What do you want to buy?\n" +
                "1 - espresso,\n" +
                "2 - latte,\n" +
                "3 - cappuccino:");

        while (true){
            int option = S.nextInt();
            MachineContains machineContains = new MachineContains();

            switch (option){
                case 1:
                    Espresso espresso = new Espresso();
                    System.out.println(
                            "The coffee machine has:\n" +
                                    (machineContains.getWater() - espresso.getWater())
                                    + " of water\n" +
                                    (machineContains.getMilk() - espresso.getMilk())
                                    + " of milk\n" +
                                    (machineContains.getCoffeeBeans() -
                                            espresso.getCoffeeBeans())
                                    + " of coffee beans\n" +
                                    (machineContains.getDisposableCups() -
                                            espresso.getDisposableCups())
                                    + " of disposable cups\n" +
                                    (machineContains.getMoney() + espresso.getCost())
                                    + " of money");
                    break;
                case 2:
                    Latte latte = new Latte();
                    System.out.println(
                            "The coffee machine has:\n" +
                                    (machineContains.getWater() - latte.getWater())
                                    + " of water\n" +
                                    (machineContains.getMilk() - latte.getMilk())
                                    + " of milk\n" +
                                    (machineContains.getCoffeeBeans() -
                                            latte.getCoffeeBeans())
                                    + " of coffee beans\n" +
                                    (machineContains.getDisposableCups() -
                                            latte.getDisposableCups())
                                    + " of disposable cups\n" +
                                    (machineContains.getMoney() + latte.getCost())
                                    + " of money");
                    break;
                case 3:
                    Cappuccino cappuccino = new Cappuccino();
                    System.out.println(
                            "The coffee machine has:\n" +
                                    (machineContains.getWater() - cappuccino.getWater())
                                    + " of water\n" +
                                    (machineContains.getMilk() - cappuccino.getMilk())
                                    + " of milk\n" +
                                    (machineContains.getCoffeeBeans() -
                                            cappuccino.getCoffeeBeans())
                                    + " of coffee beans\n" +
                                    (machineContains.getDisposableCups() -
                                            cappuccino.getDisposableCups())
                                    + " of disposable cups\n" +
                                    (machineContains.getMoney() + cappuccino.getCost())
                                    + " of money");
                    break;
                default:
                    System.out.println("Write right number");
            }
        }
    }
}
