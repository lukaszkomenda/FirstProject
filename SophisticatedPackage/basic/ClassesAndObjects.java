package SophisticatedPackage.basic;

public class ClassesAndObjects {
    public static void main(String[] args) {

        // tworzenie obiektu John, Bob i dodawanie im zmiennych wg konstruktora PersonInObjects
        PersonInObjects john = new PersonInObjects();
        john.name = "John";
        john.setAge(20);
        PersonInObjects bob = new PersonInObjects();
        bob.name = "Bob";
        bob.setAge(25);

        // wywołanie metody z konstruktora dla obiektów utworzonych w klasie
        john.sayHelloTo(bob);
        bob.sayHelloTo(john);

        // wyświetlenie wyniku
        System.out.println(john.getName() + " is " + john.getAge() + " years old.");
        System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");

    }
}
