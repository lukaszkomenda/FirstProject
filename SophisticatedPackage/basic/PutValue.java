package SophisticatedPackage.basic;

public class PutValue {

    /*
    przekazywanie argumentów jako wartość
     */

    public static void main(String[] args) {

        PutValue main = new PutValue();
        PutValue.run();
    }

    // dodawanie wielu liczb metodą
    private static void run() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = add(a, b, c);
        System.out.println(result);
    }

    private static int add(int a, int b, int c){
        return a + b + c;
    }
}
