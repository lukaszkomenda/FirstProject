package SDA;

public class graWKosci {
    public static void main(String[] args) {
        int rzut;

        rzut = (int) (Math.random() * 6 + 1);

        if(rzut % 2 == 0){
            System.out.println("Wynik jest parzysty (" + rzut + ")");
            if(rzut==6){
                System.out.println("WYGRALES");
            }
        } else {
            System.out.println("Wynik jest nieparzysty (" + rzut + ")");
        }


    }
}
