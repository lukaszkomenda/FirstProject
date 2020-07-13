package CodeWarsTests;

import CodeWars.Kata;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

public class treasureTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String pl, String expected) {
        String out = Kata.treasure(pl);

        assertTrue("Expected " + expected + " for input placement " + pl +
                ", but got " + out + ".", out == expected);
    }

    @Test
    public void testSample() {
        test("a00E", "EAST");
        test("b11W", "WEST");
    }
}
