package SDA;

public class tekstPor {
    public static void main(String[] args) {
        String tekst = "Dziś zajęcia rozpoczeły się o";
        String godzina = "9:00";
        String wynik = tekst + godzina;
        String nowewyrazy1 = wynik.substring(0,4);
        String nowewyrazy2 = wynik.substring(5,12);

        System.out.println(nowewyrazy1);
        System.out.println(nowewyrazy2);
        System.out.println("");

        int dlugoscA = nowewyrazy1.length();
        int dlugoscB = nowewyrazy2.length();
        System.out.println(dlugoscA);
        System.out.println("dlugoscA " + dlugoscA);
        System.out.println("pierwszy znak " + nowewyrazy1.charAt(0));
        System.out.println("ostatni znak " + nowewyrazy1.charAt(dlugoscA-1));
        System.out.println("");

        System.out.println(dlugoscB);
        System.out.println("dlugoscB " + dlugoscB);
        System.out.println("pierwszy znak " + nowewyrazy2.charAt(0));
        System.out.println("ostatni znak " + nowewyrazy2.charAt(dlugoscB-1));

        //czy tekst zawiera jakąś wartość
//        boolean zawieraO = false;
//        String tekstUpperCase = tekst.toUpperCase();
//        zawieraO = tekstUpperCase.contains("O");
//
//        int indexO = tekstUpperCase.indexOf("O");
//
//        System.out.println(indexO);
//        System.out.println(zawieraO);
    }
}
