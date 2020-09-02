package JetBrains;

import java.util.Scanner;

public class CoffeeIronMan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 " +
                            "- espresso, 2 - latte, 3 - cappuccino, 4 - back:");
                    String coffeeChoice = scanner.nextLine();

                    switch (coffeeChoice) {
                        case "1":
                            if (water >= 250) {
                                if (beans >= 16) {
                                    if (cups >= 1) {
                                        water -= 250;
                                        beans -= 16;
                                        money += 4;
                                        cups -= 1;
                                        System.out.println("I have enough resources, making you " +
                                                "a coffee!");
                                    } else {
                                        System.out.println("Sorry, not enough cups!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough beans!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case "2":
                            if (water >= 350) {
                                if (beans >= 20) {
                                    if (cups >= 1) {
                                        if (milk >= 75) {
                                            water -= 350;
                                            milk -= 75;
                                            beans -= 20;
                                            money += 7;
                                            cups -= 1;
                                            System.out.println("I have enough resources, making " +
                                                    "you a coffee!");
                                        } else {
                                            System.out.println("Sorry, not enough milk!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough cups!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough beans!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case "3":
                            if (water >= 200) {
                                if (beans >= 12) {
                                    if (cups >= 1) {
                                        if (milk >= 100) {
                                            water -= 200;
                                            milk -= 100;
                                            beans -= 12;
                                            money += 6;
                                            cups -= 1;
                                            System.out.println("I have enough resources, making " +
                                                    "you a coffee!");
                                        } else {
                                            System.out.println("Sorry, not enough milk!");
                                        }
                                    } else {
                                        System.out.println("Sorry, not enough cups!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough beans!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            break;
                        case "4":
                            break;
                        default:
                            System.out.println("Write correct number");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = scanner.nextInt();
                    water += addWater;

                    System.out.println("Write how many ml of milk do your want to add:");
                    int addMilk = scanner.nextInt();
                    milk += addMilk;

                    System.out.println("Write how many grams of coffee beans do you want " +
                            "to add:");
                    int addBeans = scanner.nextInt();
                    beans += addBeans;

                    System.out.println("Write how many disposable cups of coffee do " +
                            "you want" +
                            " to add:");
                    int addCups = scanner.nextInt();
                    cups += addCups;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Write correct action");
                    break;
            }
        }
    }
}
