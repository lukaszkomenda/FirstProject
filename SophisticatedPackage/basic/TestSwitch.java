package SophisticatedPackage.basic;

public class TestSwitch {
    public static void main(String[] args) {
        int variable = 3;
        int variable2 = 1;
        int variable3 = 2;

        // metoda switch wywoływanie metody w zależności od warunku
        switch (variable){
            case 1:
                System.out.println("Liczba to " + variable2);
                break;
            case 2:
                System.out.println("Liczba to " + variable3);
                break;
            default:
                System.out.println("Liczba to ani " + variable2 + ", ani " + variable3);

        }
    }
}
