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

    @Test
    public void returnsDoubleCharForGivenWordUsingSubString() {
        DoubleChar doubleChar = new DoubleChar();

        //Using String.subString
        assertEquals("TThhee", doubleChar.doubleChar2("The"));
        assertEquals("TTeesstt!!!!", doubleChar.doubleChar2("Test!!"));
    }
}