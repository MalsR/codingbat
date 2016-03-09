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

    @Test
    public void returnsStringContainingBeforeAndAfterCharactersFromWordWhenWordAppearsMultipleTimes() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("Expected only the characters before and after the word passed 'XY' that appears in the string",
                "c13i", wordEnds.wordEnds("abcXY123XYijk", "XY"));
    }

    @Test
    public void returnsStringContainingTheSameCharTwiceWhenWordAppearsAtStartAndEndOfString() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("Expected 11 to be returned as string starts and ends with word passed which is 'XY'",
                "11", wordEnds.wordEnds("XYZ1XYZ", "XYZ"));
    }

    @Test
    public void returnsStringContainingStartAndEndCharsWhenWordAppearsOnceAndLengthIsOne() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("Expected string returned to only contain the start and end chars",
                "be", wordEnds.wordEnds("bYe", "y"));
    }

    @Test
    public void returnsEmptyStringWhenStringToTestIsEmpty() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("", wordEnds.wordEnds("", "XYZ"));
    }

    @Test
    public void returnsEmptyStringWhenWordIsNotPresent() {
        WordEnds wordEnds = new WordEnds();

        assertEquals("", wordEnds.wordEnds("Bye", "tie"));
    }
}