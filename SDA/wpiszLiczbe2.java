package SDA;

public class wpiszLiczbe2 {
    public static void main(String[] args) {
        int wylosowanaLiczba = (int) Math.floor(Math.random() * 11);
        String komunikat;
//        System.out.println("Liczba " + wylosowanaLiczba);
//        System.out.println(komunikat);

        if (wylosowanaLiczba >=5){
            komunikat = "Równa wieksa niz piec: " + wylosowanaLiczba ;
        } else {
           komunikat = "Mniejsza niż piec: " + wylosowanaLiczba;
        }

        System.out.println(komunikat);
    }
}
