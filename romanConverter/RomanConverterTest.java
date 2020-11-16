package romanConverter;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static romanConverter.RomanConverterApp.convertRomanToArabicNumber;

public class RomanConverterTest {

    @Test
    public void convertOne() {
        assertEquals(1, convertRomanToArabicNumber("I"),
                "Roman should equal to 1");
    }

    @Test
    public void convertTwo() {
        assertEquals(2, convertRomanToArabicNumber("II"),
                "Roman II should equal to 2");
    }

    @Test
    public void convertIII() {
        assertEquals(3, convertRomanToArabicNumber("III"),
                "Roman III should equal to 3");
    }

    @Test
    public void convertV() {
        assertEquals(5, convertRomanToArabicNumber("V"),
                "Roman V should equal to 5");
    }

    @Test
    public void convertVI() {
        assertEquals(6, convertRomanToArabicNumber("VI"),
                "Roman VI should equal to 6");
    }

    @Test
    public void convertIV() {
        assertEquals(4, convertRomanToArabicNumber("IV"),
                "Roman IV should equal to 4");
    }

    @Test
    public void convertX() {
        assertEquals(10, convertRomanToArabicNumber("X"),
                "Roman X should equal to 10");
    }

    @Test
    public void convertIX() {
        assertEquals(9, convertRomanToArabicNumber("IX"),
                "Roman IX should equal to 9");
    }

    @Test
    public void convertXXXVI() {
        assertEquals(36, convertRomanToArabicNumber("XXXVI"),
                "Roman XXXVI should equal to 36");
    }

    @Test
    public void convertMMXII() {
        assertEquals(2012, convertRomanToArabicNumber("MMXII"),
                "Roman MMXII should equal to 2012");
    }

    @Test
    public void convertMCMXCVI() {
        assertEquals(1996, convertRomanToArabicNumber("MCMXCVI"),
                "Roman MCMXCVI should equal to " +
                        "1996");
    }

    @Test
    public void convertInvalidRomanValue() {
        assertThrows(
                IllegalArgumentException.class,
                () -> convertRomanToArabicNumber("Z"),
                "Invalid roman character Z Should throw (IllegalArgumentException)");
    }

    @Test
    public void convertVII() {
        assertEquals(7, convertRomanToArabicNumber("vii"),
                "Roman VII should equal to 7");
    }
}



