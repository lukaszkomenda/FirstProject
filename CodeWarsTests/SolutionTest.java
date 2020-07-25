package CodeWarsTests;

import CodeWars.Calculate;
import CodeWars.Cube;
import CodeWars.Kata;
import CodeWars.ZywOo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void testSetToThree() {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }

    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2},
                ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

    @Test
    public void testSomething() {
        assertTrue(Kata.zeroFuel(50, 25, 2));
        assertFalse(Kata.zeroFuel(100, 50, 1));
    }

    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }






}
