package string1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartWordTest {

    @Test
    public void returnsFirstCharOfStringWhenGivenWordLengthIsOne() {
        StartWord startWord = new StartWord();

        assertEquals("H", startWord.startWord("Hippo", "i"));
    }

    @Test
    public void returnsMatchedStringWhenGivenWordMatchesToHalfOfString() {
        StartWord startWord = new StartWord();

        assertEquals("Hell", startWord.startWord("Hello", "Hell"));
    }

    @Test
    public void returnsMatchedStringWhenGivenWordMatchesFromSecondChar() {
        StartWord startWord = new StartWord();

        assertEquals("Hel", startWord.startWord("Hello", "Xel"));
    }

    @Test
    public void returnsEmptyStringWhenGivenStringToMatchIsEmpty() {
        StartWord startWord = new StartWord();

        assertEquals("", startWord.startWord("", "Xip"));
    }

    @Test
    public void returnsMatchedStringWhenGivenWordLengthIsGreaterThanStringToCompare() {
        StartWord startWord = new StartWord();

        assertEquals("", startWord.startWord("Hel", "Hello"));
    }

    @Test
    public void returnsEmptyStringWhenGivenWordDoesNotMatch() {
        StartWord startWord = new StartWord();

        assertEquals("", startWord.startWord("Hel", "xip"));
    }
}