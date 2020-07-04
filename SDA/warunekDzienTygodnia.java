package SDA;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class warunekDzienTygodnia {
    public static void main(String[] args) {
        DayOfWeek dayOfTheWeekNr = LocalDate.now().getDayOfWeek();
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;


        if (dayOfTheWeekNr.equals(sunday)){
            System.out.println("Dziś jest niedziela - nie idziemy do pracy");
        } else if (dayOfTheWeekNr.equals(saturday)){
            System.out.println("Dziś jest sobota - nie idziemy do pracy");
        } else{
            System.out.println("Dzisiaj orka na ugorze");
        }
    }
}
