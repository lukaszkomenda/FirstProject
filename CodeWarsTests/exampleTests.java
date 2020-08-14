package CodeWarsTests;

import CodeWars.Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class exampleTests {
    @Test
    public void exampleTests() {
        assertEquals(1120, Kata.travel(1000, 10, 127, 14));
        assertEquals(1000, Kata.travel(100, 10, 0, 10));
        assertEquals(1000, Kata.travel(100, 10, 0, 10));
        assertEquals(450, Kata.travel(25, 50, 120, 18));
    }
}
