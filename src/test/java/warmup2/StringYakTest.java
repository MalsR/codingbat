package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringYakTest {

    //Removes all instances of yak where a can be any charachter

    @Test
    public void returnsStringWithoutYakPrefix() {
        StringYak stringYak = new StringYak();

        assertEquals("pak", stringYak.stringYak("yakpak"));
    }

    @Test
    public void returnsStringWithoutYakSuffix() {
        StringYak stringYak = new StringYak();

        assertEquals("pak", stringYak.stringYak("pakyak"));
    }

    @Test
    public void returnsStringWithoutYakWhenItsInMiddleOfString() {
        StringYak stringYak = new StringYak();

        assertEquals("test", stringYak.stringYak("teyakst"));
    }

    @Test
    public void returnsStringWithoutYakPrefixAndWithYaSuffix() {
        StringYak stringYak = new StringYak();

        assertEquals("123ya", stringYak.stringYak("yak123ya"));
    }

    @Test
    public void returnsEmptyStringWhenGivenStringIsEmpty() {
        StringYak stringYak = new StringYak();

        assertEquals("", stringYak.stringYak(""));
    }

    @Test
    public void returnsSameStringWhenGivenStringHasNoCharStaringWithYAndK() {
        StringYak stringYak = new StringYak();

        assertEquals("yayahello", stringYak.stringYak("yayahello"));

    }
}