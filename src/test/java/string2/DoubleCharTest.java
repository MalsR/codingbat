package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCharTest {

    @Test
    public void returnsDoubleCharForGivenWord() {
        DoubleChar doubleChar = new DoubleChar();

        assertEquals("TThhee", doubleChar.doubleChar("The"));
        assertEquals("TTeesstt!!!!", doubleChar.doubleChar("Test!!"));
    }
}