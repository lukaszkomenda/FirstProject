package EY;

import org.junit.jupiter.api.Test;

import static EY.EgoisticApp.isEgoistic;
import static org.junit.jupiter.api.Assertions.*;

class EgoisticAppTest {

    @Test
    public void testHappyEgoisticApp(){
        //given
        String numberOne = "25";

        //when
        boolean isEgo = isEgoistic(numberOne);

        //then
        assertTrue(isEgo, "xyz");
    }

    @Test
    public void testUnHappyEgoisticApp(){
        //given
        String numberTwo = "4";

        //when
        boolean isEgo = isEgoistic(numberTwo);

        //then
        assertFalse(isEgo, "xyz");
    }

}