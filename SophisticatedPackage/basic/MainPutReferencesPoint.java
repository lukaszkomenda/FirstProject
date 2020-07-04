package SophisticatedPackage.basic;

public class MainPutReferencesPoint {

    /*
    przekazywanie zmiennych jako referencje
     */

    public static void main(String[] args) {
        PutReferences point = new PutReferences();
        point.x = 5;
        point.y = 10;

        Point.change(point);

        System.out.println("Współrzędne to " + point.x + " " + point.y);
    }
}
