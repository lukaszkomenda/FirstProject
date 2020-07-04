package SDA;

public class nominaly {
    public static void main(String[] args) {
        int money[] = {1, 2, 5, 10, 20};
        int pula = 0;

        for (int i = 0; pula <= 100; i++) {
            int idx = (int) (Math.random() * money.length + 1);
            System.out.println("Pobrana wartość to: " + idx + " ");
            pula += idx;
            System.out.print("Pula to: " + pula + "\n ");
            if (pula >= 100) {
                System.out.println("Liczba pobranych pieniędzy:" + (i+1));
                return;

            }


            }


    }
    }


