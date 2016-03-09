package string2;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordEndsTest {

    @Test
    public void returnsStringContainingBeforeAndAfterCharactersFromWordWhenWordAppearsOnce() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("Expected only the characters before and after the word passed 'XY' that appears in the string",
                "34", wordEnds.wordEnds("123XY456", "XY"));
    }
}