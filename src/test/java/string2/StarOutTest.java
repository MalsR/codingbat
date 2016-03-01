package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StarOutTest {

    @Test
    public void removesCharactersSurroundingStar() {
        StarOut starOut = new StarOut();

        assertEquals("Hello", starOut.starOut("Heb*pllo"));
    }
}