package CodeWarsTests;

import CodeWars.Cube;
import CodeWars.ZywOo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

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

}
