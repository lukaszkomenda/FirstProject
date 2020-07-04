package SophisticatedPackage.basic;

// konstruktur do klasy ClassesAndObjects
public class PersonInObjects {

    //zmienne konstruktora
    String name;
    int age;

    //gettery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHelloTo(PersonInObjects person) {
        System.out.println(getName() + " said hello to " + person.getName());
    }
}
