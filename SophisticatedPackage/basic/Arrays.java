package SophisticatedPackage.basic;

public class Arrays {
    public static void main(String[] args) {
        int x = 5;
        //tablica jednowymiarowa
        int[] myArray = new int[] {1,3,5,7,9,11,13,15,17};

        /*
        myArray[0] = x;
        myArray[1] = 3;
        myArray[2] = 0;
        myArray[3] = 1;
         */


        //pętla umorzliwiająca wyświetlenie wszystkich wartości z tablicy
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
