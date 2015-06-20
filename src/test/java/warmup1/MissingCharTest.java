package warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingCharTest {

    @Test
    public void returnsStringWithRemovedCharIndex() {
        MissingChar missingChar = new MissingChar();

        assertEquals("bt", missingChar.missingChar("bat", 1));
        assertEquals("all", missingChar.missingChar("ball", 0));
        assertEquals("messae", missingChar.missingChar("message", 5));
        assertEquals("tex", missingChar.missingChar("text", 3));
    }

}