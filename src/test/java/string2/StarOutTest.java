package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StarOutTest {

    @Test
    public void removesCharactersSurroundingStar() {
        StarOut starOut = new StarOut();

        assertEquals("Hello", starOut.starOut("Heb*pllo"));
    }

    @Test
    public void returnsSameStringWhenNoStarIsPresent() {
        StarOut starOut = new StarOut();

        assertEquals("Hello", starOut.starOut("Hello"));
    }

    @Test
    public void removesCharactersSurroundingMultipleStarsTogether() {
        StarOut starOut = new StarOut();

        assertEquals("ad", starOut.starOut("ab**cd"));
    }

    @Test
    public void removesCharactersSurroundingMultipleStarsSpreadAcross() {
        StarOut starOut = new StarOut();

        assertEquals("adefjmn", starOut.starOut("ab**cdefg*ijh*lmn"));
    }

    @Test
    public void removesCharactersSurroundingStarWhenBeginningOfString() {
        StarOut starOut = new StarOut();

        assertEquals("bcd", starOut.starOut("*abcd"));
    }

    @Test
    public void removesCharactersSurroundingStarWhenEndOfString() {
        StarOut starOut = new StarOut();

        assertEquals("abc", starOut.starOut("abcd*"));
    }
}