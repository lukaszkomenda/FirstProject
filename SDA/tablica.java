package SDA;

public class tablica {
    public static void main(String[] args) {

        int [] intTab = new int[5];
        intTab[0] = 4;
        intTab[1] = 5;
        intTab[2] = 6;
        intTab[3] = 7;
        intTab[4] = 8;

        for(int i = 0; i < intTab.length; i++){
            intTab[i] = i + 4;
        }

        String[] zbiorwyrazow = new String[3];
        zbiorwyrazow[0] = "Tomek";
        zbiorwyrazow[1] = "Lukasz";
        zbiorwyrazow[2] = "Arek";

        for (int i = 0; i < intTab.length; i++){
            int element = intTab[i];
            System.out.print(element + " ");
        }

        System.out.println("");

        for (int i = 0; i < zbiorwyrazow.length; i++){
            String element = zbiorwyrazow[i];
            System.out.print(element + " ");
        }

    }
}
