package SophisticatedPackage.basic;

public class MainConstructor {

    public static void main(String[] args) {

        PointConstructor point = new PointConstructor(10, 20);

        System.out.println("x: " + point.x);
        System.out.println("y: " + point.y);

        PointConstructor point2 = point;

        point2.y = 99;

        System.out.println("x2: " + point2.x);
        System.out.println("y2: " + point2.y);

        System.out.println("x1: " + point.x);
        System.out.println("y1: " + point.y);


    }


}
