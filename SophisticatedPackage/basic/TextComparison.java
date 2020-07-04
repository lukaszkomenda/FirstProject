package SophisticatedPackage.basic;

public class TextComparison {
    public static void main(String[] args) {
        String ja = "Lukasz";
        String ty = "Lukasz";

        // porównanie tekstu do tekstu
        boolean porownanie1 = ja == ty;
        boolean porownanie2 = ja.equals(ty);
        System.out.println(porownanie1);
        System.out.println(porownanie2);
    }
}
