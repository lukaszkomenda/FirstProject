package SDA;

public class dzialaniaNaPetlach {
    public static void main(String[] args) {

        for (int i = -20; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            if (i <= -15) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            if (i >= 15) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            if (i % 2 ==0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            if (i <=7) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("\n ");

        int licznik = 0;

        for (int i = -20; i <= 20; i++) {
            licznik +=i;
        }
        System.out.println(licznik + "\n ");

        for (int i = -20; i <= 20; i++) {
            if (i >= 4) {
                licznik += i;
            }
        }
        System.out.println(licznik + "\n ");

        for (int i = -20; i <= 20; i++) {
            System.out.println(i + " do potęgi 2 to: " + Math.pow(i,2));

        }

        System.out.println("\n ");

        for (int i = -20; i <= 20; i++) {
            System.out.println(i + " reszta z dzielenia przez 10 to: " + ((double)i%10));

        }

    }
}
