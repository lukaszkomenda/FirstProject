package SophisticatedPackage.basic;

public class NamePersons {
    public static void main(String[] args) {

        /*
        tworzenie obiektów klasy
         */

        Person lukasz = new Person();
        lukasz.name = "Lukasz";
        lukasz.age = 29;
        lukasz.isAlive = true;
        lukasz.isWorking = true;

        Person leonardo = new Person();
        leonardo.name = "Leonardo";
        leonardo.age = 100;
        leonardo.isAlive = false;
        leonardo.isWorking = false;

        /*
        wywoływanie metod klas
         */

        lukasz.nameYou(true);
        leonardo.nameYou(false);

        /*
        licznik wywoływanych metod klas
         */

        int HowMuch = Person.HowMuchName();

        System.out.println("Osoby przedstawiły się " + HowMuch + " razy.");


    }
}
