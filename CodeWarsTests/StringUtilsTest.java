package CodeWarsTests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import CodeWars.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isHexNumber(""));
        assertFalse(StringUtils.isHexNumber("0x"));
        assertTrue(StringUtils.isHexNumber("0"));
        assertTrue(StringUtils.isHexNumber("0xDEADBEEF"));
        assertTrue(StringUtils.isHexNumber("1337bAbe"));
    }
}
