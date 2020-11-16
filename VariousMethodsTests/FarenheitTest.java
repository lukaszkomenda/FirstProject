package VariousMethodsTests;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static VariousMethods.Farenheit.changeCelsiusValueIntoFahrenheit;
import static org.junit.jupiter.api.Assertions.*;

class FarenheitTest {

    @Test
    public void changeCelsiusValueIntoFahrenheitTest() {
        //given
        BigDecimal value = new BigDecimal(10);

        //when
        BigDecimal fahenheit = changeCelsiusValueIntoFahrenheit(value);

        //then
        assertEquals(new BigDecimal(50), fahenheit);
    }
}