package VariousMethods;

import java.math.BigDecimal;

public class Farenheit {
    public static BigDecimal changeCelsiusValueIntoFahrenheit (BigDecimal celcius){
        final BigDecimal multipier = new BigDecimal(9);
        final BigDecimal divisor = new BigDecimal(5);
        final BigDecimal addition = new BigDecimal(32);

        BigDecimal result = new BigDecimal(String.valueOf(celcius
                .multiply(multipier)
                .divide(divisor)
                .add(addition)));

        return result;
    }
}
