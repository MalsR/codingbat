package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontBackTest {

    @Test
    public void returnsSameStringWhenOnlySingleCharacter() {
        FrontBack frontBack = new FrontBack();

        assertEquals("x", frontBack.frontBack("x"));
    }

    @Test
    public void returnsReversedFirstAndLastCharactersOfString() {
        FrontBack frontBack = new FrontBack();

        assertEquals("tab", frontBack.frontBack("bat"));
        assertEquals("wellom", frontBack.frontBack("mellow"));
    }

    @Test
    public void returnsSameStringWhenGivenStringIsEmpty() {
        FrontBack frontBack = new FrontBack();

        assertEquals("", frontBack.frontBack(""));
    }

}