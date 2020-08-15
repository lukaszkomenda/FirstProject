package CodeWarsTests;

import CodeWars.*;
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

    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

    KeepHydrated kh = new KeepHydrated();

    @Test
    public void SampleTest1() {

        assertEquals(1, kh.Liters(2));

    }
    @Test
    public void SampleTest2()  {

        assertEquals(0, kh.Liters(0.97));

    }
    @Test
    public void SampleTest3()  {

        assertEquals(7, kh.Liters(14.64));

    }
    @Test
    public void SampleTest4()  {

        assertEquals(800, kh.Liters(1600.20));

    }
    @Test
    public void SampleTest5()  {

        assertEquals(40, kh.Liters(80));

    }

    @Test
    public void basicTestsDivision(){
        assertEquals(23,Solution.solve("123",1));
        assertEquals(234,Solution.solve("1234",1));
        assertEquals(34,Solution.solve("1234",2));
        assertEquals(4,Solution.solve("1234",3));
    }

    @Test
    public void sampleTests() {
        assertEquals(3, Kata.stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
    }

    @Test
    public void sampleTestsArray() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}
