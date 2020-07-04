package SDA;

import java.util.Arrays;

public class przekazywanieParametrow {
    public static void main(String[] args) {
        System.out.println("Paremetry uruchomienia");

        if (args.length > 0){
            System.out.println(Arrays.deepToString(args));
        }
    }
}
