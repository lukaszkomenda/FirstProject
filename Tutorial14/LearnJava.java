package Tutorial14;

import java.util.ArrayList;

public class LearnJava {
    public static void main(String[] args) {
        //int a = 5;
        char b = 'i';
        long c = 400;
        double d = 3.2;
        String name = "Susan";
        System.out.println(name.toLowerCase());
        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);

        animal a = new animal();
        a.doStuff();
        //String dog= a.iAmDog();
        //System.out.println(dog);
        //ArrayList<Integer> f = new ArrayList<Integer>();
        //a.notify();
    }

    public static String addExclamationPoint(String s){
        //System.out.println(s + "!");
        return s + "!";
    }

}
