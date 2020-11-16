package VariousMethodsTests;

import VariousMethods.AddNumbers;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static VariousMethods.AddNumbers.addNumbers;
import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    @Test
    public void addNumbersTest() {
        //given
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(2);

        //when
        BigDecimal sum = addNumbers(a, b);

        //then
        assertEquals(new BigDecimal(3), sum, "xyz");
    }
}