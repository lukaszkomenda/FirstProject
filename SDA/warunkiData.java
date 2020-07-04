package SDA;

import java.time.LocalDate;
import java.time.LocalTime;

public class warunkiData {
    public static void main(String[] args) {
        int godzina = LocalTime.now().getHour();
        int nrDniaTygodnia = LocalDate.now().getDayOfWeek().getValue();
        int nrDniaWMiesiacu = LocalDate.now().getDayOfMonth();
        int nrMiesiaca = LocalDate.now().getMonth().getValue();

        if(godzina<12){
            System.out.println("Jest rano.");
        } else if (godzina>=12 && godzina <18){
            System.out.println("Jest po południu.");
        }else {
            System.out.println("Jest wieczór.");
        }

        if(nrDniaTygodnia<=5){
            System.out.println("Dzień pracujący.");
        } else {
            System.out.println("Dzień wolny.");
        }

        if (nrDniaWMiesiacu<25){
            System.out.println("Jest przed wypłatą.");
        } else {
            System.out.println("Jest po wypłacie.");
        }

        switch (nrMiesiaca){
            case 12:
            case 1:
            case 2:
                System.out.println("Jest zima.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Jest wiosna.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Jest lato.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Jest jesień");
                break;
        }


    }
}
