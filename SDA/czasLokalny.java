package SDA;

import java.time.LocalDate;
import java.time.LocalTime;

public class czasLokalny {
    public static void main(String[] args) {

        System.out.println(LocalDate.now() + " r.\n");
        System.out.println(LocalDate.of(2019,04,10) + " r.\n");
        System.out.println(LocalDate.now().plusDays(12) + " r.\n");
        System.out.println(LocalDate.parse("2019-04-10") + " r.\n");
        System.out.println(LocalDate.of(2019,04,10).isAfter(LocalDate.now()) + " r.\n");
        System.out.println(LocalDate.now().getDayOfYear() + " r.\n");
        System.out.println(LocalDate.now().getDayOfMonth() + " r.\n");
        System.out.println(LocalDate.now().getYear() + " r.\n");
        System.out.println(LocalDate.now().lengthOfMonth() + " r.\n");
        System.out.println(LocalDate.now().lengthOfYear() + " r.\n");
        System.out.println(LocalTime.now());
    }
}
