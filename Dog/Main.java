package Dog;

public class Main {
    public static void main(String[] args) {
        /*
        Stwórz klase Dog.
        a) Dodaj atrybuty rasa, wiek, plec
        b) Dodaj metody umozliwiajace ustawienie wieku oraz pobranie wieku (getAge , setAge)
        c) Dodaj konstruktor, który przyjmie wartosci dla rasy i plci, a wiek ustawi na 0
        d) Dodaj metode powodujaca wypisanie na ekran dzwieku wydawanego przez psa „Woof"
        e) Z poziomu metody main zaprezentuj dzialanie poszczególnych metody utwórz
        obiekt klasy Pies, zmodyfikuj wiek, wyswietl parametry psa.
        f) Stwórz liste skladajaca sie z 2 róznych psów, wypisz wartosci ich atrybutów.
         */
        long start = System.nanoTime();

        Dog pies1 = new Dog();
        pies1.setRasa("owczarek niemiecki");
        pies1.setPlec("samiec");
        pies1.setWiek((byte) 4);

        Dog pies2 = new Dog();
        pies2.setRasa("rottweiler");
        pies2.setPlec("samiczka");
        pies2.setWiek((byte) 2);


        System.out.println(pies1.dzwiek("") + "\n" + pies1.toString());
        System.out.println(pies2.dzwiek("") + "\n" + pies2.toString());
        System.out.println("Time: " + (System.nanoTime() - start));

    }
}
