package SophisticatedPackage.basic;

public class Person {

    /*
    deklarowanie zmiennych do obiektów, do klasy SophisticatedPackage.basic.NamePersons
     */

    String name;
    int age;
    boolean isAlive;
    boolean isWorking;

    static int HowMuch;

    /*
    deklarowanie metod do klasy SophisticatedPackage.basic.NamePersons
     */

    void nameYou(boolean formal) {
        HowMuch++;
        if (formal) {
            System.out.println("Witam Państwa serdecznie jestem " + name + " mam " + age + " lat ");
        } else {
            System.out.println("Cześć jestem " + name + " mam " + age + " lat ");
        }

    }

    static int HowMuchName(){
        return HowMuch;
    }


}
