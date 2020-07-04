package SDA_Punkt3D;

import java.util.Arrays;

public class mainPunkt3D {
    public static void main(String[] args) {
        /*
        1. Utwórz klasę Punkt3D.
        2. Dodaj stosowne pola.
        3. Skorzystaj z automatycznego generowania metod getter i setter ,
        konstruktorów oraz metody toString
        4. Utwórz kilka obiektów.
        5. Wykorzystując metodę toString wyświetl na ekran poszczególne obiekty.
         */

        punkt3d obiekt1 = new punkt3d("Lukasz", "Komenda", "Jagiellonczyka 10", "792900929");
        punkt3d obiekt2 = new punkt3d("Agata", "Grabarczyk", "Wyszyńskiego 99", "000000000");

        String [] dane1 = listakontaktow(obiekt1.imie, obiekt1.nazwisko, obiekt1.adres, obiekt1.telefon);
        String [] dane2 = listakontaktow(obiekt2.imie, obiekt2.nazwisko, obiekt2.adres, obiekt2.telefon);

    }

    public static String[] listakontaktow (String x, String y, String z, String w){
        String result[] = {x, y, z, w};
        System.out.println(Arrays.toString(result));
        return result;

    }


}
